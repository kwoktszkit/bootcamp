package com.springbootex.sbex1.exception;

import com.springbootex.sbex1.infra.BusinessException;
import com.springbootex.sbex1.infra.Code;

public class AppException extends BusinessException {

  public AppException(Code code) {
    super(code);
  }

}