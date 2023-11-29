package com.interview.memory;

// Reference queues are designed for making us aware of actions performed by the Garbage Collector. It appends a reference object
// to a reference queue as it decides to remove the referent of this reference. The idiom when using reference is to wrap an object
// in a reference type.

// This is fine as long as you don't care about when the garbage collector reclaims the objects. But if you did care when the
// garbage collector collected an object you would use something called a ReferenceQueue. The constructor for the reference types
// takes in a queue parameter. The queue can be later polled in your code for any items. When you do find an item, you would
// its an item

import java.lang.ref.WeakReference;
import java.lang.ref.ReferenceQueue;

class ReferenceQueueDemo {
    public static void main( String args[] ) {
        // Declare an integer
        Integer i = new Integer(420);

        // Create a reference queue typed on Integer
        ReferenceQueue<Integer> q = new ReferenceQueue<>();

        // Create the weak reference and pass the queue as a param
        WeakReference<Integer> wrappedInt = new WeakReference<>(i, q);

        Runtime.getRuntime().gc();

        // Prints the wrapped integer.
        System.out.println(wrappedInt.get().toString());


        // Check if the queue has any item in it. It should return
        // null since no GC has been performed
        System.out.println(q.poll() == null ? "queue is empty" : "queue has an element");
    }
}