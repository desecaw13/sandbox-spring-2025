package org.example.sandbox.staticexample;

public class StaticReference {

    private static int count = 0;

    public static void main(String[] args) {
        StaticReference.increment();
    }

    public static void increment() {
        count++;
    }
}
