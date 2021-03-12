package com.epsi.mycal;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAdd() {
        int a = 2;
        int b = 3;
        assertEquals(5, Calculator.getInstance().add(a, b));
    }

    public void testSub() {
        int a = 5;
        int b = 3;
        assertEquals(2, Calculator.getInstance().sub(a, b));
    }

    public void testMult() {
        int a = 5;
        int b = 3;
        assertEquals(15, Calculator.getInstance().mult(a, b));
    }

    public void testDiv() {
        int a = 6;
        int b = 3;
        assertEquals(2, Calculator.getInstance().div(a, b));
    }

    public void testIsPair() {
        int a = 6;
        int b = 3;
        assertTrue(Calculator.getInstance().isPair(a));
        assertFalse(Calculator.getInstance().isPair(b));
    }

    public void testIsPremier() {
        int a = 17;
        int b = 4;
        assertTrue(Calculator.getInstance().isPremier(a));
        assertFalse(Calculator.getInstance().isPremier(b));
    }


}