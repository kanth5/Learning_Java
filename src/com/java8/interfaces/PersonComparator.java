package com.java8.interfaces;

import java.util.Collections;
import java.util.List;

public class PersonComparator {

    public static List<Person> getPersons(List<Person> persons) {

//        Using anonymous class

//        Collections.sort(persons, new Comparator<Person>() {
//            public int compare(Person p1, Person p2) {
//                return p1.getName().compareTo(p2.getName());
//            }
//        });

//      Using Lambda expression

        Collections.sort(persons, (p1,p2) -> p1.getName().compareTo(p2.getName()));

        return persons;
    }
}
