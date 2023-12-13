package com.educative.interview.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetPrincipleDemo {

    public static void main( String args[] ) {
        List<? extends Number> listOfNumbers = new ArrayList<>();
        List<Integer> listOfIntegers = Arrays.asList(1,2,3,4,5);
        List<Double> listofDoubles = Arrays.asList(6d,7d,8d,9d,10d);

        listOfNumbers = listOfIntegers;

        System.out.println(listOfNumbers.equals(listOfIntegers));

        Integer i = Integer.valueOf(5);
        Double d = Double.valueOf(5);

        // Adding an integer
        // listOfNumbers.add(i); // Not Allowed
        // Adding a double
        // listOfNumbers.add(d); // Not Allowed

        // i = listOfNumbers.get(0); // <--- Compile time error

        Object object = listOfNumbers.get(0); // Allowed

        System.out.println(object.toString());

        listOfNumbers.forEach(System.out::println);
    }

}


