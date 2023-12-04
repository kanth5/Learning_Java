package com.educative.interview.generics;

import java.util.*;

class ErasureDemo2 {
    public static void main( String args[] ) {
        List<Integer> list = new ArrayList<>();
        someMethod(list);
    }

    /*
     * Uncomment the following method and comment out the
     * other method to see the compile error generated.
     *
     */
//    static void someMethod(List<Number> nums){
//      // ... method body
//    }

    static void someMethod(List<? extends Number> nums){
        // ... method body
        System.out.println("Comment out this method and uncomment the already commented method to see the compiler error.");
    }
}