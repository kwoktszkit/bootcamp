package com.springbootex.sbex1.model.dto;

import com.springbootex.sbex1.annotation.SymbolCheck;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SymbolDTO {

  @SymbolCheck
  String symbol;

}