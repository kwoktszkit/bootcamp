package com.springbootex.sbex1.annotation;

import java.util.Objects;
import com.springbootex.sbex1.config.AppStartRunner;
import com.springbootex.sbex1.model.dto.finnhub.resp.SymbolDTO;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SymbolValidator
    implements ConstraintValidator<SymbolCheck, SymbolDTO> {

  @Override
  public boolean isValid(SymbolDTO symbol, ConstraintValidatorContext context) {
    return Objects.nonNull(symbol.getSymbol())
        && AppStartRunner.availableStockList.contains(symbol.getSymbol());
  }

}