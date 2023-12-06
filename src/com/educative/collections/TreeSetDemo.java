package com.educative.collections;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String args[]) {

        List<Integer> list = new LinkedList<>();
        list.add(21);
        list.add(32);
        list.add(44);
        list.add(11);
        list.add(54);

        TreeSet<Integer> mySet = new TreeSet<>(list);
        System.out.println("TreeSet elements in ascending order " + mySet);

        TreeSet<Integer> set = new TreeSet<>();
        set.add(21);
        set.add(32);
        set.add(44);
        set.add(11);
        set.add(54);
        System.out.println("TreeSet elements in ascending order " + set);

        // This TreeSet will store the elements in reverse order.
        TreeSet<Integer> reverseSet = new TreeSet<>(Comparator.reverseOrder());
        reverseSet.add(21);
        reverseSet.add(32);
        reverseSet.add(44);
        reverseSet.add(11);
        reverseSet.add(54);
        System.out.println("TreeSet elements in descending order " + reverseSet);

        //Fetch and retrieval

        TreeSet<Integer> set2 = new TreeSet<>();

        set2.add(21);
        set2.add(32);
        set2.add(44);
        set2.add(11);
        set2.add(54);
        set2.add(3);
        set2.add(9);
        set2.add(41);

        System.out.println("Fetching the first element in TreeSet " + set2.first());
        System.out.println("Fetching the last element in TreeSet " + set2.last());
        System.out.println("Fetching all the elements less than 40 " + set2.headSet(40));
        System.out.println("Fetching all the elements greater than 40 " + set2.tailSet(40));

        System.out.println("Removing 44 from TreeSet " + set2.remove(44));
        System.out.println("Removing 100 from TreeSet " + set2.remove(100));

        System.out.println("Checking if TreeSet is empty: " + set2.isEmpty());
        System.out.println("Checking the TreeSet size: " + set2.size());
        System.out.println("Checking if TreeSet contains 44: " + set2.contains(44));
    }

}