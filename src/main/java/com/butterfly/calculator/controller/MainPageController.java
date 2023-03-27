package com.butterfly.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

  @GetMapping("/")
  public String showMainPage() {
    return "index";
  }
}