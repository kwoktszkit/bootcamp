package com.springbootex.sbex1.infra;

public class BusinessException extends Exception {

  private int code;

  public int getCode() {
    return this.code;
  }

  public BusinessException(Code code) {
    super(code.getDesc());
    this.code = code.getCode();
  }

}
