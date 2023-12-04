package com.educative.java8.collection_improvements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachRemainingDemo {

    public static void main(String args[]) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");

        Iterator<String> iterator = fruits.iterator();

        iterator.forEachRemaining((fruit) -> System.out.println(fruit));
    }
}