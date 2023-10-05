package com.springbootex.sbex1.service;

import java.util.List;
import com.springbootex.sbex1.entity.StockSymbol;
import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.model.dto.finnhub.resp.SymbolDTO;

public interface StockSymbolService {

  List<SymbolDTO> getAllSymbols() throws AppException;

  List<StockSymbol> save(List<SymbolDTO> symbols);

  void deleteAll();

}