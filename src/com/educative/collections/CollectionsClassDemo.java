package com.educative.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);
        list.add(9);

        System.out.println("The minimum element in the List is: " + Collections.min(list));

        System.out.println("The maximum element in the List is: " + Collections.max(list));

        System.out.println("Total number of times,9 is present in the List is: " + Collections.frequency(list, 9));

        System.out.println("The outcome of Binary Search is: " + Collections.binarySearch(list, new Integer(222)));

        List<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(12);
        list1.add(34);
        list1.add(54);
        list1.add(66);
        list1.add(76);

        List<Integer> list2 = new ArrayList<>();
        list2.add(90);
        list2.add(12);
        list2.add(98);
        list2.add(43);

        Collections.copy(list1, list2);

        System.out.println(list1);

        List<Integer> list3 = new ArrayList<>();
        list3.add(34);
        list3.add(45);

        Collections.fill(list3, 10);

        System.out.println(list3);
    }
}