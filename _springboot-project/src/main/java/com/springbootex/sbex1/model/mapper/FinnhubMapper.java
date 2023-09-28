package com.springbootex.sbex1.model.mapper;

import java.time.LocalDate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.springbootex.sbex1.entity.Stock;
import com.springbootex.sbex1.entity.StockPrice;
import com.springbootex.sbex1.entity.StockSymbol;
import com.springbootex.sbex1.model.CompanyProfile;
import com.springbootex.sbex1.model.Quote;
import com.springbootex.sbex1.model.Symbol;
import com.springbootex.sbex1.model.dto.CompanyProfileDTO;
import com.springbootex.sbex1.model.dto.StockDTO;
import jakarta.persistence.Column;

@Component
public class FinnhubMapper {

  @Autowired
  private ModelMapper modelMapper;

  public StockDTO map(CompanyProfile companyProfile, Quote quote) {
    return StockDTO.builder() //
        .companyProfile(
            modelMapper.map(companyProfile, CompanyProfileDTO.class)) //
        .currentPrice(quote.getCurrentPrice()) //
        .dayHigh(quote.getDayHigh()) //
        .dayLow(quote.getDayLow()) //
        .dayOpen(quote.getDayOpen()) //
        .prevDayClose(quote.getPrevDayClose()) //
        .build();
  }

  public StockSymbol map(Symbol symbol) {
    return StockSymbol.builder() //
        .symbol(symbol.getSymbol()) //
        .build();
  }

  public Stock map(CompanyProfile profile) {
    return Stock.builder() //
        .country(profile.getCountry()) //
        .companyName(profile.getCompanyName()) //
        .logo(profile.getLogo()) //
        .marketCap(profile.getMarketCap()) //
        .currency(profile.getCurrency()) //
        .build();
  }

  public StockPrice map(Quote quote) {
    return StockPrice.builder() //
        .currentPrice(quote.getCurrentPrice())
        .dayHigh(quote.getDayHigh())
        .dayHigh(quote.getDayHigh())
        .dayLow(quote.getDayLow())
        .dayOpen(quote.getDayOpen())
        .prevDayClose(quote.getPrevDayClose())
        .build();
  }

}