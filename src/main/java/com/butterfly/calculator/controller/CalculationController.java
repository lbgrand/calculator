package com.butterfly.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CalculationController {

  @GetMapping(value = "/sum/{operand1}/{operand2}", produces = "application/json")
  public double sum(
    @PathVariable double operand1, 
    @PathVariable double operand2
  ) {
    return operand1 + operand2;
  }

  @GetMapping(value = "/subtract/{operand1}/{operand2}", produces = "application/json")
  public double subtract(
    @PathVariable double operand1, 
    @PathVariable double operand2
  ) {
    return operand1 - operand2;
  }

  @GetMapping(value = "/multiply/{operand1}/{operand2}", produces = "application/json")
  public double multiply(
    @PathVariable double operand1, 
    @PathVariable double operand2
  ) {
    return operand1 * operand2;
  }

  @GetMapping(value = "/divide/{operand1}/{operand2}", produces = "application/json")
  public double divide(
    @PathVariable double operand1, 
    @PathVariable double operand2
  ) {
    if (operand2 == 0.0) {
      throw new IllegalArgumentException("Zero division is not possible!");
    }

    return operand1 / operand2;
  }
}