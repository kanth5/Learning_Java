package com.educative.interview.memory;

// Note that in the below code if instead of creating a String object using new, we initialized the str variable using a string
// literal like str = "Educative.io"; then the program behavior would be different. The String literal isn't allocated on the heap
// rather it lives in a special area called the String pool. The String pool consists of string literals that can reused and aren't
// removed from the pool even when there may be no reference to them. Therefore, if you run the same program initializing the str
// variable with a string literal, the print message would be different.

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class WeakReferenceDemo1 {
    public static void main( String args[] ) {
        String str = new String("Educative.io"); // This is a string reference

        // Create a reference queue typed on String
        ReferenceQueue<String> q = new ReferenceQueue<>();

        WeakReference<String> myString = new WeakReference<>(str,q);
        str = null; // nulling the strong reference

        String str1 = "Educative.io new";
        WeakReference<String> myString1 = new WeakReference<>(str1);

        // Try invoking the GC, but no guarantees it'll run
        Runtime.getRuntime().gc();

        if (myString.get() != null) {
            System.out.println(myString.get());
        } else {
            System.out.println("String object has been cleared by the Garbage Collector.");
        }

//        System.out.println(q.poll().toString());
        System.out.println(q.poll() == null ? "queue is empty" : "queue has an element");

        System.out.println(str1);

        if (myString1.get() != null) {
            System.out.println(myString1.get());
        } else {
            System.out.println("String object 1 has been cleared by the Garbage Collector.");
        }
    }
}