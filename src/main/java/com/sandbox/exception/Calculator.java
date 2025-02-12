package com.sandbox.exception;

public class Calculator {
    public static void main(String[] args) {
        try {
            System.out.println(divide(0, 0));
        } catch (DivideByZeroException e) {
            System.err.println("Cannot divide by zero.");
        }
    }

    public static double divide(double a, double b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException();
        }
        return a / b;
    }
}
