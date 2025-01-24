package org.example.sandbox.hello;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {
    public static void main(String[] args) {
        Algorithm algo = new Algorithm();

        System.out.println(algo.fibonacci(10));

        for (int i = 0; i < 20; i++) {
            System.out.println(algo.fibonacci(i));
        }

        System.out.println(algo.fibonacci(50));
    }

    private final List<Integer> sequence = new ArrayList<>();

    public Algorithm() {
        sequence.add(0);
        sequence.add(1);
    }

    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n < sequence.size()) {
            return sequence.get(n);
        }

        for (int i = sequence.size(); i <= n; i++) {
            sequence.add(sequence.getLast() + sequence.get(sequence.size() - 2));
        }
        return sequence.get(n);
    }
}
