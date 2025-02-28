package org.example.sandbox.stream;

import java.util.Random;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {
    private static Random random = new Random();
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWYZ".toCharArray();

    @Override
    public String get() {
        return "" + letters[random.nextInt(letters.length)];
    }
}
