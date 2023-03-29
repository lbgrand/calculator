package com.butterfly.calculator.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {

  public double sum(double operand1, double operand2) {
    return BigDecimal.valueOf(operand1).add(BigDecimal.valueOf(operand2))
      .doubleValue();
  }

  public double subtract(double operand1, double operand2) {
    return BigDecimal.valueOf(operand1).subtract(BigDecimal.valueOf(operand2))
      .doubleValue();
  }

  public double multiply(double operand1, double operand2) {
    return BigDecimal.valueOf(operand1).multiply(BigDecimal.valueOf(operand2))
      .doubleValue();
  }

  public double divide(double operand1, double operand2) {
    if (operand2 == 0.0) {
      throw new IllegalArgumentException("Zero division is not possible!");
    }

    return BigDecimal.valueOf(operand1)
      .divide(BigDecimal.valueOf(operand2), 6, RoundingMode.HALF_UP)
      .doubleValue();
  }
}