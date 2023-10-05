package com.springbootex.sbex1.model.dto.web.req;

import com.springbootex.sbex1.annotation.SymbolCheck;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class SymbolReqDTO {

  String symbol;

}