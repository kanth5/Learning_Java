package com.educative.interview.interfaces;

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

public class ComparatorDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("ab","qwer","piouy","mnbvc");
        List<String> list1 = Arrays.asList("ab","qwer","piouy","mnbvc");
        List<String> list2 = Arrays.asList("ab","qwer","piouy","mnbvc");

        Comparator<String> comparator1 = (o1, o2) -> {
            return o2.length() - o1.length();
        };

        Comparator<String> comparator2 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2.length() - o1.length());
            }
        };

        System.out.println("\nBefore");

        for(String s : list1) {
            System.out.println(s);
        }

        System.out.println("\nRegular sorting");

        Collections.sort(list);

        for(String s : list) {
            System.out.println(s);
        }

        System.out.println("\nSort using comparator1");

        Collections.sort(list1, comparator1);

        for(String s : list1) {
            System.out.println(s);
        }

        System.out.println("\nSort using comparator2");

        Collections.sort(list2, comparator2);

        for(String s : list2) {
            System.out.println(s);
        }

    }


}
