package com.epsi.mycal;

/**
 * Object that can operate different operations.
 */
public class Calculator {

    private static Calculator instance;

    public Calculator() {}

    /**
     * Get the instanciated calculator if it exists, or else create it.
     * @return Calculator instance.
     */
    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    /**
     * Add 2 integers.
     * @param a First integer.
     * @param b Second integer.
     * @return Integer result of the addition.
     */
    public int add(int a, int b) {
        return a+b;
    }

    /**
     * Subtract 2 integers.
     * @param a First integer.
     * @param b Second integer.
     * @return Integer result of the subtraction.
     */
    public int sub(int a, int b) {
        return a-b;
    }

    /**
     * Multiply 2 integers.
     * @param a First integer.
     * @param b Second integer.
     * @return Integer result of the multiplication.
     */
    public int mult(int a, int b) {
        return a*b;
    }

    /**
     * Divide 2 integers.
     * @param a First integer.
     * @param b Second integer.
     * @return Integer result of the division.
     */
    public int div(int a, int b) {
        return a/b;
    }

    /**
     * Check if given integer is pair or not.
     * @param a Integer to test.
     * @return True if a is pair, else false.
     */
    public boolean isPair(int a) {
        return a%2 == 0;
    }

    /**
     * Add if given integer is prime or not.
     * @param a First integer.
     * @return True if a is prime, else false.
     */
    public boolean isPremier(int a) {
        boolean result = true;

        for (int i=2; i<=a/2 && result ; i++){
            result = a % i != 0;
        }

        return result;
    }

}
