package com.vtxlab.demo.helloworld.controller.service;

import org.springframework.stereotype.Service;

@Service
public class HelloworldServiceImpl {

  @Override
  public String generate(int x) {
    if (x > 100)
      return "hellow world";
    return "ABC";
  }

}
