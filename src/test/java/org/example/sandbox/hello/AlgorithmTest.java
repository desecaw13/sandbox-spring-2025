package org.example.sandbox.hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {
    @Test
    void testFibonacci() {
        Algorithm algo = new Algorithm();
        assertEquals(0, algo.fibonacci(0));
        assertEquals(1, algo.fibonacci(1));
        assertEquals(1, algo.fibonacci(2));
        assertEquals(2, algo.fibonacci(3));
        assertEquals(3, algo.fibonacci(4));
        assertEquals(5, algo.fibonacci(5));
        assertEquals(8, algo.fibonacci(6));
        assertEquals(13, algo.fibonacci(7));
        assertEquals(21, algo.fibonacci(8));
        assertEquals(34, algo.fibonacci(9));
        assertEquals(55, algo.fibonacci(10));
    }

    @Test
    void testFibonacciNegative() {
        Algorithm algo = new Algorithm();
        assertThrows(IllegalArgumentException.class, () -> algo.fibonacci(-1));
    }
}
