package org.example.sandbox.sort;

import java.util.stream.IntStream;

import static java.lang.reflect.Array.newInstance;

public class SortDriver {
    public static void main(String[] args) {

        // Generate array of random Integers
        Integer[] arr = IntStream.generate(() -> (int) (Math.random() * 5000)).boxed().limit(100).toArray(Integer[]::new);

        // List first 10 unsorted elements...
        printFirstTenOfArray(arr);

        Integer[] copy1 = copyArray(arr);
        Integer[] copy2 = copyArray(arr);
        Integer[] copy3 = copyArray(arr);
        Integer[] copy4 = copyArray(arr);
        Integer[] copy5 = copyArray(arr);

        System.out.println("\nSelection Sort...");
        SortUtility.selectionSort(copy1);
        printFirstTenOfArray(copy1);

        System.out.println("\nInsertion Sort...");
        SortUtility.insertionSort(copy2);
        printFirstTenOfArray(copy2);

        System.out.println("\nBubble Sort...");
        SortUtility.bubbleSort(copy3);
        printFirstTenOfArray(copy3);

        System.out.println("\nQuick Sort...");
        SortUtility.quickSort(copy4);
        printFirstTenOfArray(copy4);

        System.out.println("\nMerge Sort...");
        SortUtility.mergeSort(copy5);
        printFirstTenOfArray(copy5);

    }

    private static <T> T[] copyArray(T[] arr) {
        T[] copy = (T[]) newInstance(arr.getClass().getComponentType(), arr.length);
        System.arraycopy(arr, 0, copy, 0, arr.length);
        return copy;
    }

    private static void printFirstTenOfArray(Integer[] arr) {
        if (arr != null) {
            int counter = 1;
            System.out.println("\nFirst 10 of Array...");

            for (Integer i : arr) {
                System.out.println(counter + ": " + i.toString());

                if (counter >= 10) {
                    break;
                }
                counter++;
            }
        }
    }
}
