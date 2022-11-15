package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @Test
    void add() {
        calculator = new Calculator();
        assertEquals(2, calculator.add(1,1));
    }
    @Test
    void moreThanZeroTrueTest() {
        calculator = new Calculator();
        assertEquals(true, calculator.moreThanZero(1));
    }
    @Test
    void moreThanZeroFalseTest() {
        calculator = new Calculator();
        assertEquals(false, calculator.moreThanZero(-3));
    }
    @Test
    void havePlusTrue() {
        calculator = new Calculator();
        assertEquals(true, calculator.havePlus("1+1"));
    }
    @Test
    void havePlusFalse() {
        calculator = new Calculator();
        assertEquals(false, calculator.havePlus("1-1"));
    }
    @Test
    void startBracketTest() {
        calculator = new Calculator();
        assertEquals(3, calculator.startBracket("1+1(12)"));
    }
    @Test
    void startBracketTestWithoutBracket() {
        calculator = new Calculator();
        assertEquals(0, calculator.startBracket("qwe"));
    }
    @Test
    void parseToIntTest() {
        calculator = new Calculator();
        assertEquals(3, calculator.parseToInt("3"));
    }
}