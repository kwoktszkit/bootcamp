package com.springbootex.sbex1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.infra.Code;
import com.springbootex.sbex1.infra.Protocol;
import com.springbootex.sbex1.model.Quote;
import com.springbootex.sbex1.service.StockService;

@Service
public class StockServiceImpl implements StockService {

  @Autowired
  private RestTemplate restTemplate;

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
  public Quote getQuote(String symbol) throws AppException {
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
      return restTemplate.getForObject(url, Quote.class);
    } catch (RestClientException e) {
      throw new AppException(Code.FINNHUB_QUOTE_NOTFOUND);
    }
  }

}