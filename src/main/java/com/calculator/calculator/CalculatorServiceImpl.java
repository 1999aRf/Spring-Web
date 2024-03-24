package com.calculator.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcome() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @Override
    public String checkParameters(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: Отсутствует один или оба параметра";
        }
        return null;
    }
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return num1 / num2;
    }
}
