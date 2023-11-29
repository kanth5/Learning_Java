package com.java.collections.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        for (char c='A'; c < 'H' ; c++) {
            for (int i=0; i < 10 ; i++) {
                list1.add(c+String.format("%01d",i));
            }
        }

        System.out.println(list1);

        System.out.println(list1.get(1));
        System.out.println(list1.indexOf("A4"));
        System.out.println(list1.set(1,"B1"));
        System.out.println(list1);
        System.out.println(list1.contains("A10"));
        System.out.println(list1.remove(8));
        System.out.println(list1);

        Iterator it = list1.iterator();
        System.out.println("---");
        System.out.println(it.next());
        System.out.println("---");
        it.remove();
        System.out.println("---");
        System.out.println(list1);

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        list1.add("A8");
        System.out.println(list1);

        list2.add("I");
        list2.add("J");
        list2.add("K");

        list1.addAll(list2);
        System.out.println(list1);

        list1.removeAll(list2);
        System.out.println(list1);

        list2.addAll(list3);
        System.out.println(list2);

        Predicate<String> p = s -> {
            return s.contains("B");
        };

        list1.removeIf(p);

        System.out.println(list1);
    }
}
