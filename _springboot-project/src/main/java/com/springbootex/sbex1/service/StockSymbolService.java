package com.springbootex.sbex1.service;

import java.util.List;
import com.springbootex.sbex1.entity.StockSymbol;
import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.model.Symbol;

public interface StockSymbolService {

  List<Symbol> getAllSymbols() throws AppException;

  List<StockSymbol> save(List<Symbol> symbols);

  void deleteAll();

}