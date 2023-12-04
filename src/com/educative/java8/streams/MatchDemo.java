package com.educative.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class MatchDemo {

    public static void main(String[] args) {
        List<Person3> list = new ArrayList<>();
        list.add(new Person3("Dave", 23, "India"));
        list.add(new Person3("Joe", 18, "USA"));
        list.add(new Person3("Ryan", 54, "Canada"));
        list.add(new Person3("Iyan", 5, "India"));
        list.add(new Person3("Ray", 63, "China"));

        // It takes a predicate as input and returns
        //      true if at least one element matches the criteria.
        //      false if no element matches the criteria.
        //      false if the stream is empty.

        boolean anyCanadian = list.stream()
                .anyMatch(p -> p.getCountry().equals("Canada"));

        System.out.println("Is there any resident of Canada: " + anyCanadian);

        // It takes a predicate as input and returns
        //      true if all elements match the criteria.
        //      true if the stream is empty.
        //      false if even a single element does not match the criteria.

        boolean allCanadian = list.stream()
                .allMatch(p -> p.getCountry().equals("Canada"));

        System.out.println("Are all persons canadian: " + allCanadian);

        // It takes a predicate as input and returns
        //      true if no elements of the stream match the provided predicate.
        //      true if the stream is empty.
        //      false if even a single element matches the criteria.

        boolean anyRussian = list.stream()
                .noneMatch(p -> p.getCountry().equals("Russia"));

        System.out.println(anyRussian);
    }
}


class Person3 {
    String name;
    int age;
    String country;

    Person3(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

}

