package com.interview.memory;

// A weakly referenced object is cleared by the Garbage Collector when it’s weakly reachable. Weak reachability means that
// an object has neither strong nor soft references pointing to it. The object can be reached only by traversing a weak reference.
// A weak reference to an object from the heap is most likely to not survive after the next garbage collection process.
// WeakHashMap is an example data structure using weak references.
// The referent is wrapped by an instance of the WeakReference class like below:

import java.lang.ref.WeakReference;

class WeakReferenceDemo {
    public static void main( String args[] ) {
        String str = new String("Educative.io"); // This is a string reference
        WeakReference<String> myString = new WeakReference<>(str);
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

        System.out.println(str1);

        if (myString1.get() != null) {
            System.out.println(myString1.get());
        } else {
            System.out.println("String object 1 has been cleared by the Garbage Collector.");
        }
    }
}