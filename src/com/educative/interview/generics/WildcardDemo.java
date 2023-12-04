package com.educative.interview.generics;

import java.util.*;

class WildcardDemo {
    public static void main( String args[] ) {
        List<Float> floats = new ArrayList<>();
        floats.add(14.4f);
        floats.add(19.9f);
        floats.add(21.1f);

        // Before reversing
        for(Float f : floats) {
            System.out.print(" " + f + " ");
        }

        reverseList(floats);
        System.out.println();

        // After reversing
        for(Float f : floats) {
            System.out.print(" " + f + " ");
        }

    }

    static void reverseList(List<? extends Number> list) {
        int i = 0;
        int e = list.size() - 1;

        while (i < e) {
            swap(list, i, e);
            i++;
            e--;
        }
    }

    // Here we say that the type variable T has
    // captured the wildcard.
    static <T> void swap(List<T> list, int i, int j) {
        T item = list.get(i);
        list.set(i, list.get(j));
        list.set(j, item);
    }
}