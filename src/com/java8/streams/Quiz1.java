package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Quiz1 {

    public static void main(String args[]) {

        List<Employee2> employeeList = new ArrayList<>();
        employeeList.add(new Employee2("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee2("Ben", 63, 25000, "China"));
        employeeList.add(new Employee2("Dave", 34, 56000, "India"));
        employeeList.add(new Employee2("Jodi", 43, 67000, "USA"));
        employeeList.add(new Employee2("Ryan", 53, 54000, "China"));

        Long totalCountInStream1 = employeeList.stream()
                .filter(e->e.getAge() > 40)
                .collect(Collectors.counting());

        System.out.println(totalCountInStream1);

        Map<String, Long> totalByCountry1 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee2::getCountry,Collectors.counting()));

        System.out.println(totalByCountry1);
    }

}
