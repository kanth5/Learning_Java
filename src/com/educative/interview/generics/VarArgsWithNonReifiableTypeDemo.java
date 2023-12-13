package com.educative.interview.generics;

import java.util.*;
@SuppressWarnings("unchecked")
class VarArgsWithNonReifiableTypeDemo {

    public static void main( String args[] ) {
        List<String> l1 = Arrays.asList("Getting");
        List<String> l2 = Arrays.asList("Complex");

        // Try to create a List<String>[] i.e. an array of a list of Strings.
        List<String>[] arrayOfListOfStrings = someMethod(l1, l2);

        // Now try to sneak in a list of integers in an array of list of strings
        List<Integer> sneakyList = Arrays.asList(420);
        List<? extends Object>[] ref = arrayOfListOfStrings;

        // What if we pass in a non-reifiable type to the varargs method? It ends up creating an array of non-reifiable type, we are
        // back to the same problem where we can store a different type in the array than intended without getting an ArrayStoreException.
        ref[0] = sneakyList;
    }

    static <T> T[] someMethod(T... args) {
        System.out.println(args.getClass());
        return args;
    }
}