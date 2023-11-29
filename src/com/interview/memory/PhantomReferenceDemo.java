package com.interview.memory;

// Phantom references are most often used for scheduling pre-mortem cleanup actions in a more flexible way than is possible with
// the Java finalization mechanism. Unlike soft and weak references, phantom references are not automatically cleared by the
// garbage collector as they are enqueued. An object that is reachable via phantom references will remain so until all such
// references are cleared or themselves become unreachable.

// Before Java 9
// Whilst Weak and Soft references are put in the queue after the object is finalized, Phantom references are put in the queue
// before the object is finalized. If for any reason you don’t poll the queue, the actual objects referenced by the
// PhantomReference will not be finalized, and you can incur an OutOfMemory error. Consider the same program from the previous
// question where instead of a weak reference we'll use a phantom reference.

// Java 9 and After
// Another difference between Phantom references and other references is that the get() method of a phantom reference always
// returns null even before a GC has occurred. The other reference types return their referents with the get() method.Phantom
// reference can be used to notify one when an object is out of scope to do resource cleanup. Remember that the object.finalize()
// method is not guaranteed to be called at the end of the life of an object, so if one needs to close files or free resources,
// one can rely on Phantom references. A typical pattern is to derive your own reference type from PhantomReference and add
// information useful for the final freeing.


import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

class PhantomReferenceDemo {
    public static void main( String args[] ) throws InterruptedException {
        // Declare an integer
        Integer i = new Integer(777);

        // Create a reference queue typed on Integer
        ReferenceQueue<Integer> q = new ReferenceQueue<>();

        // Create the weak reference and pass the queue as a param\
        PhantomReference<Integer> wrappedInt = new PhantomReference<>(i, q);

        // THE GET ALWAYS RETURNS NULL for a PhantomReference in
        // contrast to weak and soft references.
        System.out.println("get() method of a phantom references always returns null.\nwrappedInt.get() = " + wrappedInt.get());


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

            // reference is the same object as wrappedInt but the referent which was the
            // Integer object is not yet finalized but we can't access it.
            System.out.println("reference == wrappedInt : " + (reference == wrappedInt));
            System.out.println("queue has an element : " + reference);

            // ... perform resource cleanup or other finalization actions

        } else {
            System.out.println("Ooops the GC didn't run");
        }
    }
}