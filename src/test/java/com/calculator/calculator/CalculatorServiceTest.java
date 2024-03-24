package com.calculator.calculator;

import com.calculator.calculator.exceptions.DivicionByZeroException;
import com.calculator.calculator.service.CalculatorService;
import com.calculator.calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorServiceImpl();
    }

    @Test
    void addShouldReturnCorrectResult() {
        assertEquals(5, calculatorService.add(2, 3));
        assertEquals(-1, calculatorService.add(-4, 3));
    }

    @Test
    void subtractShouldReturnCorrectResult() {
        assertEquals(7, calculatorService.subtract(10,3));
        assertEquals(-7, calculatorService.subtract(3,10));
    }

    @Test
    void multiplyShouldReturnCorrectResult() {
        assertEquals(6, calculatorService.multiply(2,3));
        assertEquals(-12, calculatorService.multiply(-4,3));
    }

    @Test
    void divideShouldReturnCorrectResult() {
        assertEquals(2,calculatorService.divide(6,3));
        assertEquals(-2, calculatorService.divide(-6,3));
    }

    @Test
    void divideShouldThrowExceptionWhenDivideByZero() {
        assertThrows(DivicionByZeroException.class, () -> calculatorService.divide(1, 0));
    }
}
