package com.calculator.calculator;

public interface CalculatorService {
    String welcome();
    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int multiply(int num1, int num2);
    int divide(int num1, int num2) throws ArithmeticException;
    String checkParameters(Integer num1, Integer num2);
}

