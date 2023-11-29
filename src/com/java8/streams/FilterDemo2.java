package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo2 {

    public static void main(String[] args) {
        //Created a list of Person object.
        List<Person2> list = new ArrayList<>();
        list.add(new Person2("Dave", 23));
        list.add(new Person2("Joe", 18));
        list.add(new Person2("Ryan", 54));
        list.add(new Person2("Iyan", 5));
        list.add(new Person2("Ray", 63));

        // We are filtering out those persons whose age is more than 18 and less than 60

        list.stream()
                .filter(p -> p.getAge() > 18 && p.getAge() < 60)
                .forEach(System.out::println);

        list.stream()
                .filter(p -> p.getAge() > 18)
                .filter(p -> p.getAge() < 60)
                .forEach(System.out::println);

    }
}

class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}