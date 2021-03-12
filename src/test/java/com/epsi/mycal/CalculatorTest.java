package com.epsi.mycal;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        int valueA = 2;
        int valueB = 3;
        assertEquals(5, Calculator.getInstance().add(valueA, valueB));
    }

    @Test
    public void testSub() {
        int valueA = 5;
        int valueB = 3;
        assertEquals(2, Calculator.getInstance().sub(valueA, valueB));
    }

    @Test
    public void testMult() {
        int valueA = 5;
        int valueB = 3;
        assertEquals(15, Calculator.getInstance().mult(valueA, valueB));
    }

    @Test
    public void testDiv() {
        int valueA = 6;
        int valueB = 3;
        assertEquals(2, Calculator.getInstance().div(valueA, valueB));
    }

    @Test
    public void testIsPair() {
        int valueA = 6;  // is true
        int valueB = 3;  // not true
        assertTrue(Calculator.getInstance().isPair(valueA));
        assertFalse(Calculator.getInstance().isPair(valueB));
    }

    @Test
    public void testIsPremier() {
        int valueA = 17; // is true
        int valueB = 4;  // not true
        assertTrue(Calculator.getInstance().isPremier(valueA));
        assertFalse(Calculator.getInstance().isPremier(valueB));
    }


}