package com.educative.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("Raj");
        stringList.add("Kanth");
        stringList.add("Suma");
        stringList.add("Rishi");
        stringList.add("Latha");

        stringList.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);

        stringList.stream()
                .mapToInt(name -> name.length())
                .forEach(System.out::println);
    }
}
