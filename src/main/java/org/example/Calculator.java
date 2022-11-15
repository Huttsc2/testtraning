package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public boolean moreThanZero(int a) {
        return a > 0;
    }
    public boolean havePlus(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+')
                return true;
        }
        return false;
    }
    public int startBracket(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                return i;
        }
        return 0;
    }
}
