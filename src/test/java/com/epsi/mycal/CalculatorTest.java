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
        assertEquals(15, Calculator.getInstance().sub(a, b));
    }


}