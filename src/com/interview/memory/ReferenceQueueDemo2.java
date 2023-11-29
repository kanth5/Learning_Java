package com.interview.memory;

// Non-strong references start returning null once the heap object they weakly refer to don't have any strong references to them.
// On the contrary, the problem with non-strong references is that you never know when they will start returning null because they
// can be garbage collected anytime by the GC. ReferenceQueue is a provision by Java to help us know when the weak reference is
// eligible for GC.

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class ReferenceQueueDemo2 {
    public static void main( String args[] ) throws InterruptedException {
        // Declare an integer
        Integer i = new Integer(420);

        // Create a reference queue typed on Integer
        ReferenceQueue<Integer> q = new ReferenceQueue<>();

        // Create the weak reference and pass the queue as a param
        WeakReference<Integer> wrappedInt = new WeakReference<>(i, q);

        // Prints the wrapped integer.
        System.out.println(wrappedInt.get().toString());


        // Nullify the object
        i = null;

        // Run the GC. There's no guarantee the GC would run but
        // we can try by hinting the JVM to run the GC and sleeping
        // for a second. Hopefully it triggers the GC, it does on my
        // machine.
        System.gc();
        Thread.sleep(1000);


        // Check if the queue has any item in it.
        Reference<? extends Integer> reference = q.remove();
        if (reference != null) {
            // Because the Integer object is already collected
            // k will be null
            Integer k = reference.get();
            // reference is the same object as wrappedInt but the referent which was the
            // Integer object is now null
            System.out.println("reference == wrappedInt : " + (reference == wrappedInt));
            System.out.println("queue has an element but its already cleared and set to " + k);

            // ... perform resource cleanup or other finalization actions

        } else {
            System.out.println("Ooops the GC didn't run");
        }

    }
}
