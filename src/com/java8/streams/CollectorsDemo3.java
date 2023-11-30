package com.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo3 {

    public static void main(String args[]) {

        List<Employee2> employeeList = new ArrayList<>();
        employeeList.add(new Employee2("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee2("Ben", 63, 25000, "China"));
        employeeList.add(new Employee2("Dave", 34, 56000, "India"));
        employeeList.add(new Employee2("Jodi", 43, 67000, "USA"));
        employeeList.add(new Employee2("Ryan", 53, 54000, "China"));

        // groupingBy(Function<? super T, ? extends K> classifier)

        // The employees are grouped by country using the groupingBy() method.
        Map<String, List<Employee2>> employeeMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee2::getCountry));

        System.out.println(employeeMap);

        // groupingBy(Function<? super T,? extends K> classifier, Collector<? super T,A,D> downstream)

        // This method takes an additional second collector, which is applied to the results of the first collector.

        Map<String, Set<Employee2>> employeeMap1 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee2::getCountry, Collectors.toSet()));

        System.out.println(employeeMap1);
    }
}