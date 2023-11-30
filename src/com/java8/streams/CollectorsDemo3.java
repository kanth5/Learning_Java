package com.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo3 {

    public static void main(String args[]) {
        List<Employee4> employeeList = new ArrayList<>();
        employeeList.add(new Employee4("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee4("Ben", 63, 25000, "China"));
        employeeList.add(new Employee4("Dave", 34, 56000, "India"));
        employeeList.add(new Employee4("Jodi", 43, 67000, "USA"));
        employeeList.add(new Employee4("Ryan", 53, 54000, "China"));

        // groupingBy(Function<? super T, ? extends K> classifier)

        // The employees are grouped by country using the groupingBy() method.
        Map<String, List<Employee4>> employeeMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee4::getCountry));

        System.out.println(employeeMap);

        // groupingBy(Function<? super T,? extends K> classifier, Collector<? super T,A,D> downstream)

        // This method takes an additional second collector, which is applied to the results of the first collector.

        Map<String, Set<Employee4>> employeeMap1 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee4::getCountry, Collectors.toSet()));

        System.out.println(employeeMap1);
    }
}

class Employee4 {
    String name;
    int age;
    int salary;
    String country;

    Employee4(String name, int age, int salary, String country) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}