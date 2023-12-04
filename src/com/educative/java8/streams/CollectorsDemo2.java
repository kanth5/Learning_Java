package com.educative.java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo2 {

    public static void main(String args[]) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", 23, 23000));
        employeeList.add(new Employee("Ben", 63, 25000));
        employeeList.add(new Employee("Dave", 34, 56000));
        employeeList.add(new Employee("Jodi", 43, 67000));
        employeeList.add(new Employee("Ryan", 53, 54000));

        // This function returns a Collector that counts the number of the input elements.

        long count = employeeList.stream()
                .filter(emp -> emp.getAge() > 30)
                .collect(Collectors.counting()); // Using the counting() method to get count of employees.

        System.out.println(count);

        // Collectors.summingInt(ToIntFunction<? super T> mapper)

        // This method returns a Collector that produces the sum of an integer-valued function applied to the input elements.

        int count1 = employeeList.stream()
                .collect(Collectors.summingInt(Employee::getSalary));

        System.out.println(count1);

        // Collectors.averagingInt(ToIntFunction<? super T> mapper)

        // This method returns a Collector that produces the arithmetic mean of an integer-valued function applied to the input elements.
        // If no elements are present, the result is 0.

        double average = employeeList.stream()
                .collect(Collectors.averagingInt(Employee::getSalary));

        System.out.println(average);

        // minBy(Comparator<? super T> comparator)

        // It returns a Collector that returns the minimum element based on the given comparator.

        Optional<Employee> e1 = employeeList.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));

        System.out.println(e1);

        // maxBy(Comparator<? super T> comparator)

        // It returns a Collector that returns the maximum element based on the given comparator.

        Optional<Employee> e2 = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

        System.out.println(e2);

        // summarizingInt(ToIntFunction<? super T> mapper)

        IntSummaryStatistics summarizingInt = Stream.of("1", "2", "3")
                .collect(Collectors.summarizingInt(Integer::parseInt));
        System.out.println(summarizingInt);

        // joining() returns a Collector that concatenates the input elements into a String, in the encounter order. It also has few
        // overloaded versions which allow us to provide delimiters and prefix and suffix strings. One very important use case of this
        // method can be if we want to create a comma-separated String out of a given list.

        // Joining all the strings.
        String joinedString = Stream.of("hello", "how", "are" , "you")
                .collect(Collectors.joining());
        System.out.println(joinedString);

        // Joining all the strings with space in between.
        joinedString = Stream.of("hello", "how", "are" , "you")
                .collect(Collectors.joining(" "));
        System.out.println(joinedString);

        // Joining all the strings with space in between and a prefix and suffix.
        joinedString = Stream.of("hello", "how", "are" , "you")
                .collect(Collectors.joining(" " , "prefix","suffix"));
        System.out.println(joinedString);
    }
}