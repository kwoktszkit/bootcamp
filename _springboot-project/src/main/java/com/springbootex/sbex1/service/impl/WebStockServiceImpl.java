package com.springbootex.sbex1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.infra.Code;
import com.springbootex.sbex1.model.CompanyProfile;
import com.springbootex.sbex1.model.Quote;
import com.springbootex.sbex1.model.dto.StockDTO;
import com.springbootex.sbex1.model.mapper.FinnhubMapper;
import com.springbootex.sbex1.service.CompanyService;
import com.springbootex.sbex1.service.StockService;
import com.springbootex.sbex1.service.WebStockService;

@Service
public class WebStockServiceImpl implements WebStockService {

  @Autowired
  CompanyService companyService;

  @Autowired
  StockService stockService;

  @Autowired
  FinnhubMapper finnhubMapper;

  @Override
  public StockDTO stockInfo(String symbol) throws AppException {
    CompanyProfile profile = companyService.getCompanyProfile(symbol);
    Quote quote = stockService.getQuote(symbol);
    if (profile == null && quote == null)
      throw new AppException(Code.THIRD_PARTY_SERVER_UNAVAILABLE);
    return finnhubMapper.map(profile, quote);
  }

}