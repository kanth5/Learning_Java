package com.interview.generics;


import java.util.ArrayList;
import java.util.List;

class TypeWithoutBoundingDemo {
    public static void main(String args[]) {
        NumberCollection<Integer> myIntegerList = new NumberCollection<>();
        myIntegerList.add(5);
        myIntegerList.add(4);
        myIntegerList.printGreater(4);
    }
}

class NumberCollection<T> {

    List<T> list = new ArrayList<>();

    // Method compares integer portions of each
    // value stored in the list and prints those
    // that are greater than the method argument
    public void printGreater(T other) {
        for (T item : list) {
            // crude way to get integer portions
            int val1 = Double.valueOf(item.toString()).intValue();
            int val2 = Double.valueOf(other.toString()).intValue();
            if (val1 > val2)
                System.out.println(item);
        }
    }

    public void add(T item) {
        list.add(item);
    }
}