package com.epsi.mycal;

/**
 * Object that can operate different operations
 */
public class Calculator {

    private static Calculator instance;

    public Calculator() {}

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int mult(int a, int b) {
        return a*b;
    }

    public int div(int a, int b) {
        return a/b;
    }

    public boolean isPair(int a) {
        return a%2 == 0;
    }

    public boolean isPremier(int a) {
        boolean result = true;

        for (int i=2; i<=a/2 && result ; i++){
            result = a % i != 0;
        }

        return result;
    }

}
