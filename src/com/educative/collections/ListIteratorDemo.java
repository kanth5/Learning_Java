package com.educative.collections;

// The Iterator provides very limited capabilities as we can iterate only in the forward direction and we can’t update or insert an element to the
// list while iterating. To overcome these problems, we can use ListIterator. The listIterator() method returns an object of type ListIterator which
// can then be used to iterate the ArrayList.

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Getting ListIterator
        ListIterator<Integer> listIterator = list.listIterator();

        // Traversing elements
        System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()) {
            System.out.println("Next element is " + listIterator.next() +
                    " and next index is " + listIterator.nextIndex());
        }

        // Traversing elements, the iterator is at the end at this point
        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println("Previous element is " + listIterator.previous() +
                    " and previous index is " + listIterator.previousIndex());
        }

    }
}
