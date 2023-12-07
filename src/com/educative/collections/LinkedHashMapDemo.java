package com.educative.collections;

// A HashMap does not maintain insertion order and TreeMap stores the elements in sorted order. Now, if we want to store the elements in a Map in
// insertion order, then a LinkedHashMap can be used. LinkedHashMap is a class in the java.utils package that implements the Map interface and extends
// the HashMap class. It is similar to HashMap with the additional feature of maintaining the order of elements inserted into it.

import java.util.LinkedHashMap;
import java.util.HashMap;

public class LinkedHashMapDemo {

    public static void main(String args[]) {

        HashMap<String, Integer> stocks = new LinkedHashMap<>();

        stocks.put("Apple", 123);
        stocks.put("BMW", 54);
        stocks.put("Google", 87);
        stocks.put("Microsoft", 232);
        stocks.put("Oracle", 76);

        System.out.println(stocks);

        HashMap<String, Integer> stocks1 = new LinkedHashMap<>(16, 0.75f, true);

        stocks1.put("Apple", 123);
        stocks1.put("BMW", 54);
        stocks1.put("Google", 87);
        stocks1.put("Microsoft", 232);
        stocks1.put("Oracle", 76);

        System.out.println(stocks1);

        stocks1.get("Google");
        stocks1.get("BMW");

        System.out.println(stocks1);
    }
}