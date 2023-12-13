package com.educative.interview.generics;

import java.util.LinkedList;
import java.util.List;

public class Quiz5 {
    public static void main(String[] args) {

        // The following snippet compiles but fails at runtime
        Object[] personArray = new Person[10];
        //personArray[0] = new Integer(0); // throws ArrayStoreException at runtime

        // Fails at compile time. Use Lists instead of arrays because Lists provide greater type safety
        List<Person> list = new LinkedList<>();
        //list.add(new Integer(5));
    }
}

class Person {} // a dummy class
