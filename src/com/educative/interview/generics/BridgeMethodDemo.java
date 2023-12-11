package com.educative.interview.generics;

import java.util.*;

class BridgeMethodDemo {
    @SuppressWarnings("unchecked") // <--- Bad idea to suppress unchecked warning
    public static void main( String args[] ) {
        WorkOnListOfInts<List<Integer>> worker = new WorkOnListOfInts<>();
        List<Double> doubleList = Arrays.asList(4.4);
        List objList = doubleList;
        worker.work(objList);

        // worker.work(doubleList);  // <--- Doesn't compile
    }
}

class WorkOnListOfInts<T extends List<Integer>> {

    public void work(T ints) {

        for (Integer x : ints) {
            System.out.println(x);
        }
    }
}