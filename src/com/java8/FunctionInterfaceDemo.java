package com.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterfaceDemo {

    public static void main(String[] args) {
        // Created a function which returns the length of string.
        Function<String, Integer> lengthFunction = str -> str.length();

        System.out.println("String length: " + lengthFunction.apply("This is awesome!!"));

        // Function which adds 10 to the given element.
        Function<Integer, Integer> increment1 = x -> x + 10;
        // Function which doubles the given element.
        Function<Integer, Integer> multiply1 = y -> y * 2;
        // Since we are using compose(), multiplication will be done first and then increment will be done.
        System.out.println("compose result: " + increment1.compose(multiply1).apply(3));

        Function<Integer,Integer> increment2 = x -> x + 10;
        Function<Integer,Integer> multiply2 = y -> y * 2;
        // Since we are using andThen(), increment will be done first and then multiplication will be done.
        System.out.println("andThen result: " + increment2.andThen(multiply2).apply(3));

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println("Sum = " + add.apply(2, 3));
    }
}