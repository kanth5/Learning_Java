package com.educative.collections;

import java.util.*;

public class HashSetDemo {
    public static void main(String args[]) {

        Set<Integer> set = new HashSet<>();

        System.out.println("Inserting 23 in the HashSet:  " + set.add(23));
        System.out.println("Inserting 34 in the HashSet:  " + set.add(34));
        System.out.println("Inserting 23 in the HashSet:  " + set.add(23));

        System.out.println(set);

        System.out.println(set.contains(23));

        set.remove(23);

        System.out.println("HashSet after removing one element" + set);

        set.clear();

        System.out.println("HashSet after removing all elements" + set);

        System.out.println(set.isEmpty());

        Set<Integer> set1 = new HashSet<>();

        set1.add(23);
        set1.add(34);
        set1.add(56);

        for (int i : set1) {
            System.out.println(i);
        }

        Iterator<Integer> itr = set1.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        set1.forEach(System.out::println);

        // Creating an ArrayList from existing set.
        List<Integer> list = new ArrayList<>(set1);
        // Sorting the list.
        Collections.sort(list);

        list.forEach(System.out::println);
    }
}