package com.educative.interview.generics;

// The Collection<?> is a collection of unknowns, and we can’t add any type to it. We don’t know what the element type of myColl stands for therefore
// we cannot add objects to it. The only element that you can ever insert into a List<?> is null. The wildcard type prevents us from extracting elements
// from the List<?> as any type other than Object.

import java.util.*;

class Quiz3 {
    public static void main( String args[] ) {
        Collection<?> myColl = new ArrayList<>();
        // compile time error
        // myColl.add(new Object());    // java: incompatible types: java.lang.Object cannot be converted to capture#1 of ?
        myColl.add(null);
        myColl.add(null);
        System.out.println(myColl.isEmpty());
        System.out.println(myColl);
        System.out.println(myColl.size());
        myColl.forEach(System.out::println);
        System.out.println(myColl.getClass());
    }
}