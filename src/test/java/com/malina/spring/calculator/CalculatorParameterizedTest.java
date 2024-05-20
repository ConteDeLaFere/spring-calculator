package com.malina.spring.calculator;

import com.malina.spring.calculator.service.CalculatorService;
import com.malina.spring.calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

public class CalculatorParameterizedTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(12, 13),
                Arguments.of(100, 80),
                Arguments.of(15, 3),
                Arguments.of(3, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void additionParameterizedTest(double a, double b) {
        double expected = a + b;
        double result = calculatorService.add(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("data")
    public void subtractionParameterizedTest(double a, double b) {
        double expected = a - b;
        double result = calculatorService.sub(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("data")
    public void divisionParameterizedTest(double a, double b) {
        double expected = a / b;
        double result = calculatorService.div(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("data")
    public void multiplicationParameterizedTest(double a, double b) {
        double expected = a * b;
        double result = calculatorService.multi(a, b);
        assertEquals(expected, result);
    }
}
