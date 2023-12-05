package com.educative.collections;

import java.util.*;

public class Quiz1 {

    public static void main(String args[]) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));

        System.out.println(" --- Employees having age > 50 --- 1 --- ");

        for (Employee e : list) {
            if (e.age > 50) {
                System.out.println(e.name);
            }
        }

        System.out.println(" --- Employees having age > 50 --- 2 --- ");

        Iterator<Employee> itr1 = list.iterator();

        itr1.forEachRemaining(e -> {
            if (e.age > 50) {
                System.out.println(e.name);
            }
        });

        System.out.println(" --- Employees having age > 50 --- 3 --- ");

        list.stream().filter(e->e.age>50).map(e->e.name).forEach(System.out::println);

        System.out.println(" --- Employees from USA --- 1 --- ");

        for (Employee e : list) {
            if (e.country == "USA") {
                System.out.println(e.name);
            }
        }

        System.out.println(" --- Sort Employees by country name ascending --- 1 --- ");

        Collections.sort(list, (e1,e2) -> e1.country.compareTo(e2.country));

        for (Employee e : list) {
            System.out.println(e.country);
        }

        System.out.println(" --- Remove Employees from USA --- 2 --- ");

        Iterator<Employee> itr2 = list.iterator();

        while(itr2.hasNext()) {
            if (itr2.next().country.equals("USA")) {
                itr2.remove();
            }
        }

        for (Employee e : list) {
            System.out.println(e.country);
        }
    }
}

class Employee {

    String name;
    int age;
    String country;

    public Employee(String name, int age, String country) {
        super();
        this.name = name;
        this.age = age;
        this.country = country;
    }

}