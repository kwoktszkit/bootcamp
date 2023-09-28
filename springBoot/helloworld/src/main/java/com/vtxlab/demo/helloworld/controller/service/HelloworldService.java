package com.vtxlab.demo.helloworld.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloworldControllerImpl implements HelloworldController {

  @Autowired
  HelloworldService helloworldService;

  @Override
  public String generate(int x) {
    if (x > 100)
      return "hello world!!!";
    return "ABC";
    ;
  }

}