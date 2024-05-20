package com.malina.spring.calculator.service;

import com.malina.spring.calculator.exception.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double div(double num1, double num2) {
        if (num2 == 0) {
            throw new DivisionByZeroException();
        }
        return num1 / num2;
    }

    @Override
    public double multi(double num1, double num2) {
        return num1 * num2;
    }
}
