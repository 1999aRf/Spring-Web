package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String add(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: Отсутствует один или оба параметра";
        }
        int sum = calculatorService.add(num1, num2);
        return num1 + "+" + num2 + "=" + sum;
    }

    @GetMapping("/minus")
    public String subtract (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: Отсутствует один или оба параметра";
        }
        int difference = calculatorService.subtract(num1, num2);
        return num1 + "-" + num2 + "=" + difference;
    }

    @GetMapping("/multiply")
    public String multiply (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: Отсутствует один или оба параметра";
        }
        int product = calculatorService.multiply(num1, num2);
        return num1 + "*" + num2 + "=" + product;
    }

    @GetMapping("/divide")
    public String divide (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: Отсутствует один или оба параметра";
        }
        if (num2 == 0) {
            return "Ошибка: Деление на ноль";
        }
        int quotient = calculatorService.divide(num1, num2);
        return num1 + "/" + num2 + "=" + quotient;
    }
}
