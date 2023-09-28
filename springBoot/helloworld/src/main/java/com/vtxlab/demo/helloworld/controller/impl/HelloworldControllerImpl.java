package com.vtxlab.demo.helloworld.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vtxlab.demo.helloworld.controller.service.HelloworldService;

@Controller
@ResponseBody
@RequestMapping(value = "/api/v1")

public class HelloworldControllerImpl implements HelloworldController {

  @Autowired
  HelloworldService helloworldService;

  @Override
  public String hello() {
    return helloworldService.generate(102);
  }

}
