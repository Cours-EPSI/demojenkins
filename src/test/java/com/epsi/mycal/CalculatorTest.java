package com.epsi.mycal;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        int a = 2;
        int b = 3;
        assertEquals(5, Calculator.getInstance().add(a, b));
    }

    @Test
    public void testSub() {
        int a = 5;
        int b = 3;
        assertEquals(2, Calculator.getInstance().sub(a, b));
    }

    @Test
    public void testMult() {
        int a = 5;
        int b = 3;
        assertEquals(15, Calculator.getInstance().mult(a, b));
    }

    @Test
    public void testDiv() {
        int a = 6;
        int b = 3;
        assertEquals(2, Calculator.getInstance().div(a, b));
    }

    @Test
    public void testIsPair() {
        int a = 6;
        int b = 3;
        assertTrue(Calculator.getInstance().isPair(a));
        assertFalse(Calculator.getInstance().isPair(b));
    }

    @Test
    public void testIsPremier() {
        int a = 17;
        int b = 4;
        assertTrue(Calculator.getInstance().isPremier(a));
        assertFalse(Calculator.getInstance().isPremier(b));
    }


}