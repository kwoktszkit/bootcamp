package com.springbootex.sbex1.model.graph;

import lombok.Builder;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
public class Point {

  private Price closePrice;

  private TranDayTime tranDateTime;

  public Point(double closePrice, TranDayTime tranDateTime) {
    this.closePrice = new Price(closePrice);
    this.tranDateTime = tranDateTime;
  }

}