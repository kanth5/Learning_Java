package com.interview.memory;

// The remove() is a blocking call and doesn't return till an object becomes available in the queue. The point of this
// exercise is to exhibit how PhantomReference can be used in practice. Because the CustomReference holds a strong reference
// to the referent in the constructor, the integer object doesn't become eligible for garbage collection even after the variable
// i is set to null. If you run the following snippet, it'll time out. You can comment the highlighted line 61 and the program
// would not block.

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;


class PhantomReferenceDemo1 {
    public static void main( String args[] ) throws InterruptedException {
        // Declare an integer
        Integer i = new Integer(123);

        // Create a reference queue typed on Integer
        ReferenceQueue<Integer> q = new ReferenceQueue<>();

        // Create the weak reference and pass the queue as a param\
        CustomReference<Integer> wrappedInt = new CustomReference<>(i, q);

        // THE GET ALWAYS RETURNS NULL for a PhantomReference in
        // contrast to weak and soft references.
        System.out.println(wrappedInt.get());


        // Nullify the object
        i = null;

        // Run the GC. There's no guarantee the GC would run but
        // we can try by hinting the JVM to run the GC and sleeping
        // for a second. Hopefully it triggers the GC, it does on my
        // machine.
        System.gc();
        Runtime.getRuntime().gc();
        Thread.sleep(1000);


        // Check if the queue has any item in it.
        @SuppressWarnings("unchecked")
        CustomReference<Integer> custRef = (CustomReference<Integer>) q.remove();
        if (custRef != null) {

            // reference is the same object as wrappedInt but the referent which was the
            // Integer object is not yet finalized but we can't access it.
            System.out.println("reference == wrappedInt : " + (custRef == wrappedInt));
            System.out.println("queue has an element but its already cleared and set to " + custRef);

            // cast
            custRef.doCleanup();

            // ... perform resource cleanup or other finalization actions

        } else {
            System.out.println("Ooops the GC didn't run");
        }
    }
}

class CustomReference<T> extends PhantomReference<T> {

    T referent;

    public CustomReference(T referent, ReferenceQueue<T> q) {
        super(referent, q);
        // Comment the following line to make the program work
        this.referent = referent;
    }

    public void doCleanup() {
        // Try to access referent
        System.out.println(referent);
        System.out.println("...");
    }
}