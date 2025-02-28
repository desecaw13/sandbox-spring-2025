package org.example.sandbox.stream;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.*;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);
        List<String> words = Arrays.asList("Thing", "Holster", "Dog", "Help", "Me", "Start");

        IntPredicate isEven = x -> x % 2 == 0;
        //Predicate<Integer> isEvenP = x -> x % 2 == 0;

        List<Integer> squares = numbers.stream().map(x -> x * x).toList();
        squares.forEach(System.out::println);

        List<String> result = words.stream().filter(s -> s.startsWith("S")).toList();
        result.forEach(System.out::println);

        List<String> result2 = words.stream().sorted().toList();
        result2.forEach(System.out::println);

        numbers.stream().map(x -> x * x).forEach(System.out::println);

        int sum = IntStream.rangeClosed(1, 5).filter(isEven).sum();
        System.out.println(sum);
        int sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum2);

        new Random().ints(1, 11).skip(5).limit(50).forEach(System.out::println);

        System.out.println();
        final AtomicInteger counter = new AtomicInteger(1);
        IntStream.generate(counter::getAndIncrement).filter(isEven).limit(10).forEach(System.out::println);

        String randomString = Stream.generate(new StringGenerator()).limit(16).collect(Collectors.joining());
        System.out.println(randomString);
    }
}
