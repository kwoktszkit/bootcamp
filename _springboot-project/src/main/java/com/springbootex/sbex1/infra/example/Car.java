package com.springbootex.sbex1.infra.example;

import lombok.Getter;

@Getter
public class Car {

  int speed = 0;

  public Car(int speed) {
    this.speed = speed;
  }

}