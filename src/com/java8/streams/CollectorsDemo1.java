package com.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

// Collectors is a final class that extends the Object class. It provides the most common mutable reduction operations
// that could be required by application developers as individual static methods.

public class CollectorsDemo1 {

    public static void main(String args[]) {
        List<Employee2> employeeList = new ArrayList<>();
        employeeList.add(new Employee2("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee2("Ben", 63, 25000, "India"));
        employeeList.add(new Employee2("Dave", 34, 56000, "Bhutan"));
        employeeList.add(new Employee2("Jodi", 43, 67000, "China"));
        employeeList.add(new Employee2("Ryan", 53, 54000, "Libya"));

        // Collectors.toList()

        List<String> empName = employeeList.stream()
                .map(emp -> emp.getName())
                .collect(Collectors.toList());

        System.out.println(empName);

        // Collectors.toSet()

        Set<String> empName2 = employeeList.stream()
                .map(emp -> emp.getCountry())
                .collect(Collectors.toSet());

        System.out.println(empName2);

        // Collectors.toCollection(Supplier<C> collectionFactory)

        // This method returns a Collector that collects all the input elements into a new Collection.
        // This method takes a Supplier as a parameter. The Supplier supplies the collection of our choice.

        LinkedList<String> empName3 = employeeList.stream()
                .map(emp -> emp.getName())
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println(empName3);

        // Collectors.toMap()

        // toMap() is used to collect stream elements into a Map instance. This method takes two parameters
        //      keyMapper - used for extracting a Map key from a stream element
        //      valueMapper - used for extracting a value associated with a given key

        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("far");
        list.add("away");
        list.add("again");

        Map<String,Integer> nameMap = list.stream()
                .collect(Collectors.toMap(s -> s , s -> s.length()));

        System.out.println(nameMap);

        //  if the list has duplicate elements, toMap() will throw an exception. To solve this problem, there is an overloaded version of toMap() that takes an additional
        //  BinaryOperator as a parameter. This is used to decide which element should be considered in case of duplicates.

        list.add("done");

        Map<String,Integer> nameMap2 = list.stream()
                .collect(Collectors.toMap(s -> s , s -> s.length(), (s1,s2) -> s1));

        System.out.println(nameMap2);

        // There is one more overloaded version of toMap() method, which allows us to provide the implementation of Map that you want to use.

        Map<String,Integer> nameMap3 = list.stream()
                .collect(Collectors.toMap(s -> s , s -> s.length(), (s1,s2) -> s1, TreeMap::new));

        System.out.println(nameMap3);

        // collectingAndThen(Collector<T,A,R> downstream, Function<R,RR> finisher)

        // This method returns a Collector that accumulates the input elements into the given Collector and then performs an additional finishing function.

        List<String> unmodifiableList = list.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

        System.out.println(unmodifiableList);
    }
}