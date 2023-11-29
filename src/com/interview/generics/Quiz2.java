package com.interview.generics;

import java.util.HashMap;
import java.util.Iterator;

class Quiz2 {
    public static void main( String args[] ) {
        // Generates a compiler warning
        HashMap<Integer,Integer> myMap = new HashMap();

        System.out.println("program still works though.");

//        myMap.put(1,100);
//        myMap.put(2,200);
//        myMap.put(3,300);
//
//        Iterator myMapIter = myMap.entrySet().iterator();
//
//        while (myMapIter.hasNext()) {
//            System.out.println(myMapIter.next());
//        }
    }
}