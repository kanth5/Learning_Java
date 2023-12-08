package com.educative.Arrays;

import java.util.Arrays;

public class ArraySortDemo {

    public static void main(String args[]) {

        Integer[] numbers = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
        Arrays.sort(numbers);

        for (int i : numbers) {
            System.out.print(i + " ");
        }

        System.out.println();

        Integer[] numbers1 = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
        Arrays.parallelSort(numbers1);

        for (int i : numbers1) {
            System.out.print(i + " ");
        }

    }

}
