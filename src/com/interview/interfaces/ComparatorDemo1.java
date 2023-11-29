package com.interview.interfaces;

// The Comparator is a functional interface that can be used to specify an ordering relation between the
// elements of a type other than their natural order. Usually it is passed into a method that performs some
// ordering function such as sorting. The Comparator interface can be used to override a type's natural ordering,
// or order objects of a type that does not implement the Comparable interface. For example, we can create a
// comparator for type string which orders strings with the highest length first.

// The contract for the Comparable interface dictates us to throw a NullPointerException when we try to compare
// a null value to an object of a type implementing the interface. However, we may optionally implement comparing
// null values with the Comparator interface.

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo1 {

    public static void main(String[] args) {

        List<Person3> list = Arrays.asList(new Person3("abc",15,20),
                new Person3("def",25,25),
                new Person3("ghi",10,30));

        Comparator<Person3> comparator1 = (o1, o2) -> {
            return o2.getAge() - o1.getAge();
        };

//        Comparator<String> comparator2 = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return (o2.length() - o1.length());
//            }
//        };

        System.out.println("\nBefore");

        for(Person3 p : list) {
            System.out.println(p.toString());
        }

        System.out.println("\nSort using comparator1");

        Collections.sort(list, comparator1);

        for(Person3 p : list) {
            System.out.println(p.toString());
        }
    }
}

class Person3 {

    public Person3(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    private String name;
    private int age;
    private int height;

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

