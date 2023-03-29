package com.butterfly.calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculationServiceTest {

  private CalculationService calculationService = new CalculationService();
  
  @Test
  public void shouldSumTwoNumbersCorrectly() {
    double result = calculationService.sum(67.78, 103.46);

    assertEquals(171.24, result);
  }

  @Test
  public void shouldSubractTwoNumbersCorrectly() {
    double result = calculationService.subtract(67.78, 103.46);

    assertEquals(-35.68, result);
  }

  @Test
  public void shouldMultiplyTwoNumbersCorrectly() {
    double result = calculationService.multiply(67.78, 103.46);

    assertEquals(7012.5188, result);
  }

  @Test
  public void shouldDivideTwoNumbersCorrectly() {
    double result = calculationService.divide(67.78, 103.46);

    assertEquals(0.655132, result);
  }
}