package com.educative.interview.classes;

import java.util.ArrayList;
import java.util.List;

public class CloneObjectDemo {

    public static void main(String[] args) {

        Employees apple = new Employees();
        apple.add("Tim Cook");
        Employees microsoft = apple.clone();
        microsoft.list.get(0).name = "Satya Nadella";

        System.out.println(apple.list.get(0).name);
    }
}

class Employees {

    List<Person> list = new ArrayList<>();

    public Employees() {

    }

    public void add(String name) {
        list.add(new Person(name));
    }

    public Employees clone() {
        Employees clone = new Employees();
        for (Person person : list) {
            clone.list.add(person);
        }
        return clone;
    }
}

class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }
}