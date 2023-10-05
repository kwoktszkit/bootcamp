package com.springbootex.sbex1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.springbootex.sbex1.entity.Stock;
import com.springbootex.sbex1.entity.StockPrice;
import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.infra.Code;
import com.springbootex.sbex1.infra.Protocol;
import com.springbootex.sbex1.model.dto.finnhub.resp.QuoteDTO;
import com.springbootex.sbex1.repository.StockPriceRepository;
import com.springbootex.sbex1.repository.StockRepository;
import com.springbootex.sbex1.service.StockPriceService;
import jakarta.persistence.EntityNotFoundException;

@Service
public class StockPriceServiceImpl implements StockPriceService {

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private StockRepository stockRepository;

  @Autowired
  private StockPriceRepository stockPriceRepository;

  @Autowired
  @Qualifier(value = "finnhubToken")
  private String token;

  @Value(value = "${api.finnhub.domain}")
  private String domain;

  @Value(value = "${api.finnhub.base-url}")
  private String baseUrl;

  @Value(value = "${api.finnhub.endpoints.stock.quote}")
  private String quoteEndpoint;

  @Override
  public QuoteDTO getQuote(String symbol) throws AppException {
    String url = UriComponentsBuilder.newInstance() //
        .scheme(Protocol.HTTPS.name()) //
        .host(domain) //
        .pathSegment(baseUrl) //
        .path(quoteEndpoint) //
        .queryParam("symbol", symbol) //
        .queryParam("token", token) //
        .build() //
        .toUriString();
    System.out.println("url=" + url);
    try {
      return restTemplate.getForObject(url, QuoteDTO.class);
    } catch (RestClientException e) {
      throw new AppException(Code.FINNHUB_QUOTE_NOTFOUND);
    }
  }

  @Override
  public StockPrice save(Long id, StockPrice stockPrice) {
    Stock stock = stockRepository.findById(id).orElse(null);
    stockPrice.setStock(stock);
    return stockPriceRepository.save(stockPrice);
  }

}