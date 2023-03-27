package com.butterfly.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainPageController {

  @GetMapping("/")
  public String showMainPage() {
    return "index";
  }
}