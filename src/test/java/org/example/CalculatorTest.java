package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(2, calculator.add(1,1));
    }
    @Test
    void moreThanZeroTrueTest() {
        assertEquals(true, calculator.moreThanZero(1));
    }
    @Test
    void moreThanZeroFalseTest() {
        assertEquals(false, calculator.moreThanZero(-3));
    }
    @Test
    void havePlusTrue() {
        assertEquals(true, calculator.havePlus("1+1"));
    }
    @Test
    void havePlusFalse() {
        assertEquals(false, calculator.havePlus("1-1"));
    }
    @Test
    void startBracketTest() {
        assertEquals(3, calculator.startBracket("1+1(12)"));
    }
    @Test
    void startBracketTestWithoutBracket() {
        assertEquals(0, calculator.startBracket("qwe"));
    }
}