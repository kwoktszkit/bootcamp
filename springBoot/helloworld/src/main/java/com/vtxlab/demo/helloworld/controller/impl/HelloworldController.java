package com.vtxlab.demo.helloworld.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;

public interface HelloworldController {
  @GetMapping(value = "/helloworld")
  String hello();
}
