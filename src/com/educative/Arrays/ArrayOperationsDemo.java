package com.educative.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOperationsDemo {

    public static void main(String args[]) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // The asList() method returns a fixed-size list, so it is not possible to add or remove elements
        // from this list.

        List<Integer> list1 = Arrays.asList(numbers);

        System.out.print(list1);
        System.out.println();

        List<Integer> list2 = new ArrayList<>(list1);

        list2.add(11);

        System.out.println(list2);

        Integer[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean isEqual = Arrays.equals(numbers1, numbers2);

        System.out.println("Checking if two arrays are equal : " + isEqual);

        Integer[] numbers3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.fill(numbers3, 20);

        for (int i : numbers3) {
            System.out.print(i + " ");
        }

    }
}