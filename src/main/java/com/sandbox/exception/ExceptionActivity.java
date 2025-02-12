package com.sandbox.exception;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionActivity {
    public static void main(String[] args) {
        try {
            int i = 0 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Object o = null;
            int i = (int) o;
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int i = Integer.MAX_VALUE + 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("close");
        }

        try {
            int i = 1;
        } finally {
            System.out.println("closer");
        }

        try {
            Integer n = null;
            int i = n / 0;
        } catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(System.in)) {
            scanner.reset();
        }

        try (Scanner scanner = new Scanner(System.in)) {
            throw scanner.ioException();
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
