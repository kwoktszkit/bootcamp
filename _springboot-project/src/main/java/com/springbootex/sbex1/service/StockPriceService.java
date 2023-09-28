package com.springbootex.sbex1.service;

import com.springbootex.sbex1.entity.StockPrice;
import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.model.Quote;

public interface StockPriceService {

  Quote getQuote(String symbol) throws AppException;

  StockPrice save(Long id, StockPrice stockprice);

}