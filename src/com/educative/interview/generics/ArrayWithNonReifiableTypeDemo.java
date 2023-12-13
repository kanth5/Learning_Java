package com.educative.interview.generics;

import java.util.*;

class ArrayWithNonReifiableTypeDemo {
    @SuppressWarnings("unchecked")
    public static void main( String args[] ) {
        List<String>[] arrayOfStringOfLists = new List[5];
        List<? extends Object>[] ref = arrayOfStringOfLists;
        List<Integer> sneakyList = new ArrayList<Integer>();
        sneakyList.add(420);
        // We successfully added an integer list to an array of string lists
        ref[0] = sneakyList;

        /* Uncommenting the below code will throw a class cast exception */

//        List<String> iExpectStringList = arrayOfStringOfLists[0];
//        for(String str : iExpectStringList)
//            System.out.println(str);
//
    }
}