package com.springbootex.sbex1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.infra.ApiResponse;
import com.springbootex.sbex1.model.dto.StockDTO;
import com.springbootex.sbex1.model.dto.SymbolDTO;

public interface StockOperation {

  @GetMapping(value = "/stock")
  @ResponseStatus(value = HttpStatus.OK)
  ApiResponse<StockDTO> stockInfo(@RequestParam("symbol") SymbolDTO symbol)
      throws AppException;
}
