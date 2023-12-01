package com.java8.collection_improvements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorImprovementDemo {

    public static void main(String args[]) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Jane", 54));
        personList.add(new Person("Dave", 43));
        personList.add(new Person("Carl", 34));
        personList.add(new Person("Dave", 21));

        // Before Java 8, we used an anonymous comparator to sort the List.

        System.out.println("---0--- compare by name");

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        personList.forEach(System.out::println);
        System.out.println("---1--- compare by age");

        // After Java 8

        Collections.sort(personList, Comparator.comparing(Person::getAge));

        personList.forEach(System.out::println);
        System.out.println("---2---");

        List<Person> personList1 = new ArrayList<>();

        personList1.add(new Person("Jane", 54));
        personList1.add(new Person("Dave", 43));
        personList1.add(new Person("Carl", 34));
        personList1.add(new Person("Dave", 21));

        personList1.forEach(System.out::println);
        System.out.println("---3--- compare by name then by age");

        Collections.sort(personList1,Comparator.comparing(Person::getName).thenComparing(Person::getAge));

        personList1.forEach(System.out::println);
        System.out.println("---4--- natural ordering");

        List<String> fruits = new ArrayList<>();
        fruits.add("guava");
        fruits.add("peach");
        fruits.add("apple");
        fruits.add("banana");

        Collections.sort(fruits, Comparator.naturalOrder());

        fruits.forEach(System.out::println);
        System.out.println("---5--- reverse ordering");

        Collections.sort(fruits, Comparator.reverseOrder());
        fruits.forEach(System.out::println);
        System.out.println("---6--- nulls first");

        fruits.add(null);

        Collections.sort(fruits, Comparator.nullsFirst(Comparator.naturalOrder()));
        fruits.forEach(System.out::println);

        System.out.println("---7--- nulls last");

        Collections.sort(fruits, Comparator.nullsLast(Comparator.naturalOrder()));
        fruits.forEach(System.out::println);

        System.out.println("---8---");



        System.out.println("---9---");
    }
}

class Person {
    String name;
    int age;
    int yearsOfService;

    Person(String name, int age) {
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