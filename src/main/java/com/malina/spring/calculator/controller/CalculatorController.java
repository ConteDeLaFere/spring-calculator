package com.malina.spring.calculator.controller;

import com.malina.spring.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping
    public String greeting() {
        return "Добро пожаловать!";
    }

    @GetMapping("/add")
    public String add(@RequestParam double num1, @RequestParam double num2) {
        return String.format("%.3f + %.3f = %.3f", num1, num2, service.add(num1, num2));
    }

    @GetMapping("/sub")
    public String sub(@RequestParam double num1, @RequestParam double num2) {
        return String.format("%.3f - %.3f = %.3f", num1, num2, service.sub(num1, num2));
    }

    @GetMapping("/div")
    public String div(@RequestParam double num1, @RequestParam double num2) {
        return String.format("%.3f / %.3f = %.3f", num1, num2, service.div(num1, num2));
    }

    @GetMapping("/multi")
    public String multi(@RequestParam double num1, @RequestParam double num2) {
        return String.format("%.3f * %.3f = %.3f", num1, num2, service.multi(num1, num2));
    }
}
