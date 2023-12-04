package com.java.interviewbit.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>();

//        for (int i=0; i < 10 ; i++) {
//            treeSet.add("A"+i);
//        }

        for (char c='A'; c < 'H' ; c++) {
            for (int i=0; i < 10 ; i++) {
                treeSet.add(c+String.format("%01d",i));
            }
        }

        System.out.println(treeSet);

//        System.out.println(treeSet.get(1));
//        System.out.println(treeSet.indexOf("A4"));
//        System.out.println(treeSet.set(1,"B1"));

        System.out.println(treeSet.contains("A10"));
        System.out.println(treeSet.remove("A8"));
        System.out.println(treeSet);

        Iterator it = treeSet.iterator();
        System.out.println("---");
        System.out.println(it.next());
        System.out.println("---");
        it.remove();
        System.out.println("---");
        System.out.println(treeSet);

//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        treeSet.add("A8");
        System.out.println(treeSet);
        System.out.println("---");

        System.out.println(treeSet.add("A8"));
//        treeSet.add(null); Does not allow nulls. Generates null pointer exception

//        System.out.println(treeSet);
        System.out.println("---");
    }
}
