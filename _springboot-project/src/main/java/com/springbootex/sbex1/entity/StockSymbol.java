package com.springbootex.sbex1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StockSymbol {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String symbol;

  public String getSymbol() {
    return null;
  }

  public static Object builder() {
    return null;
  }

}
