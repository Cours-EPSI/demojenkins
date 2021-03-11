package com.epsi.mycal;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAdd() {
        int a = 2;
        int b = 3;
        assertEquals(5, Calculator.getInstance().add(2, 3));
    }

    public void testSub() {
        int a = 5;
        int b = 3;
        assertEquals(2, Calculator.getInstance().sub(5, 3));
    }

}