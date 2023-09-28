package com.example2.democalculator.controller.impl;

import com.example2.democalculator.DemoCalculatorApplication;

@RestController
@RequestMappling(value = "/api/v1")
public class BeanDisplayController {

  @Autowired
  DemoCalculatorApplication app;

  @Override
  public List<String> getAllBeans(){
    return Arrays.asList(app.getBeans());
  }

}
