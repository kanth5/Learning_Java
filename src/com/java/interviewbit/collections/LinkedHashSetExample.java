package com.java.interviewbit.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        Set<String> hashSet = new LinkedHashSet<>();

//        for (int i=0; i < 10 ; i++) {
//            hashSet.add("A"+i);
//        }

        for (char c='A'; c < 'H' ; c++) {
            for (int i=0; i < 10 ; i++) {
                hashSet.add(c+String.format("%01d",i));
            }
        }

        System.out.println(hashSet);

//        System.out.println(hashSet.get(1));
//        System.out.println(hashSet.indexOf("A4"));
//        System.out.println(hashSet.set(1,"B1"));

        System.out.println(hashSet.contains("A10"));
        System.out.println(hashSet.remove("A8"));
        System.out.println(hashSet);

        Iterator it = hashSet.iterator();
        System.out.println("---");
        System.out.println(it.next());
        System.out.println("---");
        it.remove();
        System.out.println("---");
        System.out.println(hashSet);

//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        hashSet.add("A8");
        System.out.println(hashSet);
        System.out.println("---");

        hashSet.add("A8");
        hashSet.add(null);

        hashSet.add("A8");
        hashSet.add(null);

        System.out.println(hashSet);
        System.out.println("---");
    }
}
