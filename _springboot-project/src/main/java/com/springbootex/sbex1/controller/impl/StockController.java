package com.springbootex.sbex1.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbootex.sbex1.config.AppStartRunner;
import com.springbootex.sbex1.controller.StockOperation;
import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.infra.ApiResp;
import com.springbootex.sbex1.model.dto.web.req.SymbolReqDTO;
import com.springbootex.sbex1.model.dto.web.resp.StockDTO;
import com.springbootex.sbex1.service.WebStockService;

@RestController
@RequestMapping(value = "/api/v1")
public class StockController implements StockOperation {

  @Autowired
  private WebStockService webStockService;

  @Override
  public ApiResp<StockDTO> stockInfo(SymbolReqDTO symbol)
      throws AppException {

    return ApiResp.<StockDTO>builder() //
        .ok() //
        .data(webStockService.stockInfo(symbol.getSymbol())) //
        .build();
  }

}