package com.springbootex.sbex1.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbootex.sbex1.entity.Stock;
import com.springbootex.sbex1.entity.StockPrice;
import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.infra.Code;
import com.springbootex.sbex1.infra.Protocol;
import com.springbootex.sbex1.infra.RedisHelper;
import com.springbootex.sbex1.model.CompanyProfile;
import com.springbootex.sbex1.model.dto.finnhub.resp.QuoteDTO;
import com.springbootex.sbex1.model.dto.web.resp.CompanyProfileDTO;
import com.springbootex.sbex1.model.mapper.FinnhubMapper;
import com.springbootex.sbex1.repository.StockPriceRepository;
import com.springbootex.sbex1.repository.StockRepository;
import com.springbootex.sbex1.repository.StockSymbolRepository;
import com.springbootex.sbex1.service.CompanyService;
import com.springbootex.sbex1.service.StockPriceService;
import com.springbootex.sbex1.service.StockSymbolService;
import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.model.dto.finnhub.resp.CompanyProfile2DTO;
import com.springbootex.sbex1.model.dto.finnhub.resp.QuoteDTO;

import jakarta.persistence.EntityNotFoundException;
import lombok.val;

@Service
public class CompanyServiceImpl implements CompanyService {

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private StockPriceService stockPriceService;

  @Autowired
  private FinnhubMapper finnhubMapper;

  @Autowired
  private StockRepository stockRepository;

  @Autowired
  private StockPriceRepository stockPriceRepository;

  @Autowired
  private StockSymbolRepository stockSymbolRepository;

  @Autowired
  private RedisHelper redisHelper;

  @Autowired
  private ObjectMapper redisObjectMapper;

  @Autowired
  @Qualifier(value = "finnhubToken")
  private String token;

  @Value(value = "${api.finnhub.domain}")
  private String domain;

  @Value(value = "${api.finnhub.base-url}")
  private String baseUrl;

  @Value(value = "${api.finnhub.endpoints.stock.profile2}")
  private String companyProfile2Endpoint;

  @Value(value = "${redis-key.company-profile2}")
  private String redisKeyForProfile2;

  @Override
  public void refresh() throws AppException {
    // getCompanyProfile(String symbol)
    stockSymbolRepository.findAll().stream() //
        .forEach(symbol -> {
          try {
            // Get Compnay Profile 2 (New)
            CompanyProfile2DTO newProfile = this.getCompanyProfile(symbol.getSymbol());

            // Old Stock
            Optional<Stock> oldStock = stockRepository.findByStockSymbol(symbol);
            // Update the stock entity
            if (oldStock.isPresent()) { //
              // id & symbol no change
              Stock stock = oldStock.get();
              stock.setCountry(newProfile.getCountry());
              stock.setLogo(newProfile.getLogo());
              stock.setCompanyName(newProfile.getCompanyName());
              stock.setMarketCap(newProfile.getMarketCap());
              stock.setCurrency(newProfile.getCurrency());
              if (newProfile != null
                  && newProfile.getTicker().equals(symbol.getSymbol())) {
                stock.setStockStatus('A');
              } else {
                stock.setStockStatus('I');
              }
              stockRepository.save(stock);
              System.out.println("completed symbol=" + symbol.getSymbol());

              // Get Stock price and save a new record of price into DB
              QuoteDTO quote = stockPriceService.getQuote(symbol.getSymbol());
              StockPrice stockPrice = finnhubMapper.map(quote);
              stockPrice.setStock(stock);
              stockPriceRepository.save(stockPrice);
              System.out.println("completed symbol=" + symbol.getSymbol());
            } else {
              System.out.println(symbol.getSymbol() + " is NOT FOUND.");
            }
          } catch (AppException e) {
            System.out
                .println("RestClientException: Symbol" + symbol.getSymbol());
          }

        });
    // If normal response, findById, put the updated entity to DB
    // If abnormal response, patch Entity status to 'I'

  }

  @Override
  public List<Stock> findAll() {
    // return stockRepository.findAllById2(4L); // Test nativeQuery
    // return stockRepository.findAllById3(4L); // Test JPQL
    return stockRepository.findAll(); // mocked
  }

  @Override
  public List<Stock> findByCountryAndMarketCap(String country,
      double marketCap) {
    return stockRepository
        .findFirst3ByCountryAndMarketCapGreaterThanEqualOrderByIdDesc(country,
            marketCap);
  }

  @Override
  public void updateById(Long id, Stock newStock) {
    Stock stock = stockRepository.findById(id) //
        .orElseThrow(
            () -> new EntityNotFoundException("Entity Stock ID not Found"));
    stock.setCompanyName(newStock.getCompanyName());
    stock.setCountry(newStock.getCountry());
    stock.setIpoDate(newStock.getIpoDate());
    stock.setMarketCap(newStock.getMarketCap());
    stock.setCurrency(newStock.getCurrency());
    stock.setLogo(newStock.getLogo());
    stockRepository.save(stock);
  }

  @Override
  public void updateCompanyNameById(Long id, String companyName) {
    Stock stock = stockRepository.findById(id) //
        .orElseThrow(
            () -> new EntityNotFoundException("Entity Stock ID not Found"));
    stock.setCompanyName(companyName);
    stockRepository.save(stock);
  }

  @Override
  public Stock save(Stock stock) {
    return stockRepository.save(stock); // insert into
  }

  @Override
  public void deleteById(Long id) {
    stockRepository.deleteById(id); // delete from table where id = ?
  }

  @Override
  public void deleteAll() {
    stockRepository.deleteAll();
  }

  @Override
  public CompanyProfile2DTO getCompanyProfile(String symbol)
      throws AppException {
    String url = UriComponentsBuilder.newInstance() //
        .scheme(Protocol.HTTPS.name().toLowerCase()) //
        .host(domain) //
        .pathSegment(baseUrl) //
        .path(companyProfile2Endpoint) //
        .queryParam("symbol", symbol) //
        .queryParam("token", token) //
        .build() //
        .toUriString();
    String key = RedisHelper.formatKey(redisKeyForProfile2, symbol);

    // Invoke Company Profile 2 with Redis Handling
    try {
      CompanyProfile2DTO profile = restTemplate.getForObject(url, CompanyProfile2DTO.class); // mocked
      if (Objects.nonNull(profile)) { // success
        redisHelper.set(key, profile, 600000000);
      } else { // fail, get from redis
        profile = (CompanyProfile2DTO) redisHelper.get(key);
        if (profile == null)
          throw new AppException(Code.FINNHUB_PROFILE2_NOTFOUND);
      }
      return profile;
    } catch (RestClientException e) {
      CompanyProfile2DTO profileFromRedis = (CompanyProfile2DTO) redisHelper.get(key);
      if (profileFromRedis == null)
        throw new AppException(Code.FINNHUB_PROFILE2_NOTFOUND);
      return profileFromRedis;
    }
  }
}