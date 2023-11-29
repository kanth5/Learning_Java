package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamDemo {

    public static void main(String[] args) {

        Stream<Integer> intStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        intStream.forEach(p-> System.out.println(p));

        List<String> stringList = new ArrayList<>();

        stringList.add("Raj");
        stringList.add("Kanth");
        stringList.add("Suma");
        stringList.add("Rishi");
        stringList.add("Latha");

        Stream<String> stringStream = stringList.stream();

        stringStream.forEach(p-> System.out.println(p));
    }


}
