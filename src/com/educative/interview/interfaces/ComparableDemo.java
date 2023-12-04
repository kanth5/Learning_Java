package com.educative.interview.interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableDemo {
    public ComparableDemo() {
    }

    public static void main(String[] args) {

        List<Person2> list = Arrays.asList(new Person2("abc", 15, 20),
                new Person2("def", 25, 25),
                new Person2("ghi", 10, 30));

        System.out.println("\nBefore");

        Iterator var2 = list.iterator();

        Person2 p;

        while (var2.hasNext()) {
            p = (Person2) var2.next();
            System.out.println(p.toString());
        }

        Collections.sort(list);

        System.out.println("\nAfter");

        var2 = list.iterator();

        while (var2.hasNext()) {
            p = (Person2) var2.next();
            System.out.println(p.toString());
        }

    }
}