package com.springbootex.sbex1.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbootex.sbex1.controller.StockOperation;
import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.infra.ApiResponse;
import com.springbootex.sbex1.model.dto.StockDTO;
import com.springbootex.sbex1.model.dto.SymbolDTO;
import com.springbootex.sbex1.service.WebStockService;

@RestController
@RequestMapping(value = "/api/v1")
public class StockController implements StockOperation {

  @Autowired
  private WebStockService webStockService;

  @Override
  public ApiResponse<StockDTO> stockInfo(SymbolDTO symbol)
      throws AppException {
    return ApiResponse.<StockDTO>builder() //
        .ok() //
        .data(webStockService.stockInfo(symbol.getSymbol())) //
        .build();
  }

}