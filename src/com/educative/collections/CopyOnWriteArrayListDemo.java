package com.educative.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {

        Object[] o = new Object[0];

        System.out.println(o.length + " " + o.hashCode() + " " + o.toString());

        int[] num_array = new int[10];

        for(int i=0 ; i < num_array.length ; i++) {
            num_array[i] = i;
        }

        Integer[] int_obj_array = new Integer[10];

        for(int i=0 ; i < num_array.length ; i++) {
            int_obj_array[i] = i;
        }

        List list1 = new CopyOnWriteArrayList(int_obj_array);

        System.out.println(list1);

        // list1.forEach(i-> System.out.println(i));

        List<Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(20);
        list2.add(30);

        List<Integer> list3 = new CopyOnWriteArrayList(list2);

        System.out.println(list3);

        List<String> list = new CopyOnWriteArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        //Created an iterator
        Iterator<String> itr = list.iterator();
        //Adding elements after creating iterator. ConcurrentModificationException will not be thrown.
        list.add("Papaya");

        //Iterating the list through the iterator that was created earlier. Papaya will not be present.
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Again getting the iterator");
        //Again creating the iterator. This time papaya will be present.
        itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        // There is one interesting thing about this iterator that makes it different from the iterator of other List implementations such as ArrayList
        // or LinkedList. The iterator returned by the iterator() method of CopyOnWriteArrayList class does not support the remove method. If we want to
        // delete an element from the ArrayList while iterating, then we should use the iterator’s remove method. The same does not hold true for a
        // CopyOnWriteArrayList. In CopyOnWriteArrayList, we can directly remove the element from the list while iterating using the collection's remove method

        // The reason for this is that we are iterating over a snapshot of the List but when we remove an element, it is removed from the copy of the List.
        // So no ConcurrentModificationException is thrown.

        //Created an iterator
        Iterator<String> itr2 = list.iterator();

        while(itr2.hasNext()) {
            System.out.println(itr2.next());
            list.remove("Orange");
        }

        System.out.println("Again creating the iterator");

        //Created an iterator
        itr2 = list.iterator();

        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        // The one last thing that we need to discuss is why the iterator of CopyOnWriteArrayList does not have the remove method. Firstly it is not
        // needed as in a CopyOnWriteArrayList we can directly remove the element from the List without fearing any exception. Secondly, if there was a
        // remove method in the iterator() then it will not be very useful. It will remove the element from the snapshot that is created for iteration.
        // The actual array which holds the data will not be changed.
    }
}
