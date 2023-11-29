package com.java8.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Sean", 23, "US"));
        persons.add(new Person("Paul", 23, "Australia"));
        persons.add(new Person("John", 23, "India"));

        for (Person person : persons) {
            System.out.println(person.getName());
        }

        List<Person> sortedPersons = PersonComparator.getPersons(persons);

        for (Person person : sortedPersons) {
            System.out.println(person.getName());
        }

        List<Integer> numbers = new ArrayList<>();

        numbers.add(20);
        numbers.add(15);
        numbers.add(10);

        for (Integer i : numbers) {
            System.out.println(i);
        }

        Collections.sort(numbers);

        for (Integer i : numbers) {
            System.out.println(i);
        }

    }
}
