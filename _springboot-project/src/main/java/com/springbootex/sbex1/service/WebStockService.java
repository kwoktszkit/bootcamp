package com.springbootex.sbex1.service;

import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.model.dto.web.resp.StockDTO;

public interface WebStockService {

  StockDTO stockInfo(String symbol) throws AppException;

}