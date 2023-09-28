package com.springbootex.sbex1.service;

import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.model.Quote;

public interface StockService {

  Quote getQuote(String symbol) throws AppException;

}
