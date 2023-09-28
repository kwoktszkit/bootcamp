package com.example.demoresttemplate.exception;

import com.example.demoresttemplate.infra.Code;

public class BusinessException extends Exception {

  private int code;

  public BusinessException(Code code) {
    super(code.getDesc());
    this.code = code.getCode();
  }

}
