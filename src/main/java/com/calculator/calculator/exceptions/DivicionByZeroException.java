package com.calculator.calculator.exceptions;

public class DivicionByZeroException extends IllegalArgumentException{
    public DivicionByZeroException(String errorMessage) {
        super(errorMessage);
    }
}
