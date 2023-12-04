package com.educative.interview.methods;

// Even though the runtime type of the variable ref is Set but compile time type is Collection and the method matching is performed
// at compile time therefore the print method which takes in a collection type is invoked when the program is run.

import java.util.*;

class MethodOverloadDemo {
    public static void main( String args[] ) {
        Set<String> set = new HashSet<>(Arrays.asList("hello", "world"));
        Collection<String> ref = set;
        print(ref);
    }

    static void print(Set<String> collection) {
        System.out.println("Method deals with sets only");
    }

    static void print(Collection<String> collection) {
        System.out.println("Method deals with collections only");
    }
}
