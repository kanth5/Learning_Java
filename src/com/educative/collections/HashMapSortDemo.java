package com.educative.collections;

import java.util.*;

public class HashMapSortDemo {

    public static void main(String args[]) {

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(123, "Alex");
        employeeMap.put(342, "Ryan");
        employeeMap.put(143, "Joe");
        employeeMap.put(234, "Allen");
        employeeMap.put(432, "Roy");

        System.out.println("Unsorted map " + employeeMap);

        // 1. Add all the elements from a HashMap into a TreeMap

        TreeMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.putAll(employeeMap);
        System.out.println("Sorted map " + sortedMap);

        // 2. Use ArrayList to store keys and values and sort them

        List<Integer> keyList = new ArrayList<>(employeeMap.keySet());
        Collections.sort(keyList);
        System.out.println(keyList);

        List<String> valuesList = new ArrayList<>(employeeMap.values());
        Collections.sort(valuesList);
        System.out.println(valuesList);

        // 3. Using Lambdas and Streams

        System.out.println("Sorting by key");
        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("Sorting by value");
        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }
}