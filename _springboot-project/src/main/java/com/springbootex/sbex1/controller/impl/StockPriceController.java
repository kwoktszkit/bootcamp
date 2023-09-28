package com.springbootex.sbex1.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootex.sbex1.service.StockPriceService;

@RestController
@RequestMapping
public class StockPriceController {

  @Autowired
  private StockPriceService stockPriceService;
}
