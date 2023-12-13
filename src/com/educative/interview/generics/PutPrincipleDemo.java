package com.educative.interview.generics;

import java.util.*;
class PutPrincipleDemo {
    public static void main( String args[] ) {
        List<? super Number> listOfNumbers = new ArrayList<>();
        Integer i = Integer.valueOf(5);
        Double d = Double.valueOf(5);

        // Adding an integer
        listOfNumbers.add(i); // Allowed
        // Adding a double
        listOfNumbers.add(d); // Allowed

        // i = listOfNumbers.get(0); // <--- Compile time error

        Object object = listOfNumbers.get(0); // Allowed

        System.out.println(object.toString());

        listOfNumbers.forEach(System.out::println);
    }
}
