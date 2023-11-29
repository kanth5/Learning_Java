package com.interview.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindDemo {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23, "India"));
        list.add(new Person("Joe", 18, "USA"));
        list.add(new Person("Ryan", 54, "Canada"));
        list.add(new Person("Iyan", 5, "India"));
        list.add(new Person("Ray", 63, "China"));

        // It returns an Optional describing the first element of this stream, or an empty Optional if the stream is empty

        Optional<Person> person = list.stream()               // Creating a Stream of person objects.
                .filter(p -> p.getCountry().equals("India")) // Filter to get only persons living in India.
                .findFirst();                                // Returning the first person encountered.

        if (person.isPresent()) {
            System.out.println(person);
        }

        // It returns an Optional describing some element of this stream, or an empty Optional if the stream is empty. Now you might be wondering why we need this
        // method if we already have the findFirst() operation. This operation is particularly useful in the case of parallel streams.

        Optional<Person> p = list.stream()
                .filter(q -> q.getCountry().equals("India"))
                .findAny();

        if (p.isPresent()) {
            System.out.println(p);
        }
    }
}

class Person {
    String name;
    int age;
    String country;

    Person(String name, int age, String country) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country +
                '}';
    }

}
