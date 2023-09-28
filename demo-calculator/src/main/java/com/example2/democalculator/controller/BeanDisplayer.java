package com.example2.democalculator.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public class BeanDisplayer {

  @GetMapping(value = "/bean");
  List<String> getAllBean;

}
