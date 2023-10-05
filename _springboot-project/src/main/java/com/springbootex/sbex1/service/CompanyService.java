package com.springbootex.sbex1.service;

import java.util.List;
import com.springbootex.sbex1.entity.Stock;
import com.springbootex.sbex1.exception.AppException;
import com.springbootex.sbex1.model.CompanyProfile;
import com.springbootex.sbex1.model.dto.finnhub.resp.CompanyProfile2DTO;

public interface CompanyService {

  CompanyProfile2DTO getCompanyProfile(String symbol) throws AppException;

  void refresh() throws AppException;

  void updateById(Long id, Stock stock);

  List<Stock> findAll();

  List<Stock> findByCountryAndMarketCap(String country, double marketCap);

  Stock save(Stock stock);

  void deleteById(Long id);

  void deleteAll();

  void updateCompanyNameById(Long id, String companyName);

}