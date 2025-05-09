package com.example;

/**
 * A simple calculator utility class.
 * <p>
 * This class is not designed for inheritance.
 * </p>
 */
public final class Calculator {

    // Private constructor to prevent instantiation
    private Calculator() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Adds two integers and returns the resultsdf.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the sum of a and b
     */
    public static int add(final int a, final int b) {
        return a + b;
    }
}

