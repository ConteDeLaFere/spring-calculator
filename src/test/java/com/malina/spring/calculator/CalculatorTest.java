package com.malina.spring.calculator;

import com.malina.spring.calculator.exception.DivisionByZeroException;
import com.malina.spring.calculator.service.CalculatorService;
import com.malina.spring.calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void divisionByZeroTest() {
        assertThrows(DivisionByZeroException.class, () -> calculatorService.div(1, 0));
    }

    @Test
    public void additionTest1() {
        double result = calculatorService.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void additionTest2() {
        double result = calculatorService.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void subtractionTest1() {
        double result = calculatorService.sub(10, 20);
        assertEquals(-10, result);
    }

    @Test
    public void subtractionTest2() {
        double result = calculatorService.sub(100, 20);
        assertEquals(80, result);
    }


    @Test
    public void divisionTest1() {
        double result = calculatorService.div(5, 1);
        assertEquals(5, result);
    }

    @Test
    public void divisionTest2() {
        double result = calculatorService.div(5, 2);
        assertEquals(2.5, result);
    }

    @Test
    public void multiplicationTest1() {
        double result = calculatorService.multi(2, 5.5);
        assertEquals(11, result);
    }

    @Test
    public void multiplicationTest2() {
        double result = calculatorService.multi(4.2, 5);
        assertEquals(21, result);
    }

}
