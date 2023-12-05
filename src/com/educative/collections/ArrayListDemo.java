package com.educative.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String args[]) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);  // This will add 4 at the end of the List.
        System.out.println(list);

        list.add(1, 50); // This will add 50 at index 1. All the other elements will be shifted to right.
        System.out.println(list);

        List newList = new ArrayList(); // Creating a new List which will be added to original list.
        newList.add(150);
        newList.add(160);

        list.addAll(newList); // This will add all the elements present in newList to list.
        System.out.println(list);

        System.out.println("The element at index two is " + list.get(1));

        System.out.println("The size of the List is  " + list.size());

        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(80);

        System.out.println(list1);

        list1.remove(1);  // This will remove the element at index 1 i.e 20.
        System.out.println(list1);

        list1.remove(new Integer(30)); // This will remove 30 from the list
        System.out.println(list1);

        list1.clear(); //This will remove all the elements from the list.
        System.out.println(list1);

        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("banana");

        fruitList.replaceAll((element) -> element.toUpperCase());

        System.out.println(fruitList);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(10);

        list2.set(1, 100);

        System.out.println(list2);

        if (list2.contains(30)) {
            System.out.println("List2 contains 30");
        }

        System.out.println("Index of first occurrence of 10 is " + list2.indexOf(10));
        System.out.println("Index of last occurrence of 10 is " + list2.lastIndexOf(10));

        System.out.println("Iterating using for loop");

        for(int i=0; i<list2.size() ; i++) {
            System.out.println(list2.get(i));
        }

        System.out.println("Iterating using enhanced for loop");

        for (Integer i : list2) {
            System.out.println(i);
        }

        System.out.println("Iterating using iterator methods");

        Iterator<Integer> itr = list2.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Iterating using forEachRemaining() method
        System.out.println("Iterating using forEachRemaining() method");
        Iterator<Integer> newItr = list2.iterator();
        newItr.forEachRemaining(element -> System.out.println(element));

        // If we try to directly remove an element while iterating an ArrayList using an iterator is created, then ConcurrentModificationException will
        // also be thrown. We should always use the remove() method in the iterator to remove an element from the ArrayList.

        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(10);

        Iterator<Integer> itr3 = list3.iterator();

        while (itr3.hasNext()) {
            int next = itr3.next();

            if (next == 30) {
                // list3.remove(new Integer(30));
            }

            // correct way to remove

//            if(next == 30) {
//                itr3.remove();
//            }
        }

        // If an element is added to the ArrayList after the iterator is created then also ConcurrentModificationException will be thrown.

        List<Integer> list4 = new ArrayList<>();
        list4.add(34);
        list4.add(45);

        Iterator<Integer> itr4 = list4.iterator();
        // list4.add(54);

        while(itr4.hasNext()) {
            System.out.println(itr4.next());
        }

    }

}
