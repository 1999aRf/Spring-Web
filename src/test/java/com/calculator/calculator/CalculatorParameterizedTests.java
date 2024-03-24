package com.calculator.calculator;

import com.calculator.calculator.service.CalculatorService;
import com.calculator.calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTests {
    private CalculatorService calculatorService = new CalculatorServiceImpl() {
    };

    @ParameterizedTest
    @CsvSource({
            "3, 4, 7",
            "-3, 2, -1"
    })
    public void testAddition(int a, int b, int expected) {
        assertEquals(expected, calculatorService.add(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 4, 1",
            "-3, 2, -5"
    })
    public void testSubtraction(int a, int b, int expected) {
        assertEquals(expected, calculatorService.subtract(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 4, 20",
            "-3, 2, -6"
    })
    public void testMultiplication(int a, int b, int expected) {
        assertEquals(expected, calculatorService.multiply(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "8, 4, 2",
            "-6, 2, -3"
    })
    public void testDivision(int a, int b, int expected) {
        assertEquals(expected, calculatorService.divide(a, b));
    }
}
