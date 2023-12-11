package com.educative.interview.generics;

// List<Integer> is not a subtype of List<Number>
// Collections are invariant

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ErasureDemo3 {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        List<Number> numList = new ArrayList<>();

        numList.add(new Scanner(System.in).nextDouble());

        intList.add(new Scanner(System.in).nextInt());

        numList.addAll(intList);

        // Integer i = numList.get(0);      // throws error

        numList.forEach(System.out::println);
    }
}
