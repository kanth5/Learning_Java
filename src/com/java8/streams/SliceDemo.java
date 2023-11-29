package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class SliceDemo {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("China");
        countries.add("India");
        countries.add("UK");
        countries.add("China");

        // It returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.
        // So, if you have a stream of custom objects then your custom class should override equals() and hashcode() methods.

        countries.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("---");

        // It returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.

        countries.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("---");

        // It returns a stream consisting of the remaining elements of this stream after discarding the first 'n' elements of
        // the stream. If this stream contains fewer than 'n' elements then an empty stream will be returned.

        countries.stream()
                .distinct()
                .skip(2)
                .forEach(System.out::println);

    }
}
