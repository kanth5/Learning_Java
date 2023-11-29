package com.interview.classes;

import java.util.HashSet;

class FinalizeDemo {

    static HashSet<UsefulObjectClass> immortals = new HashSet<>();

    public static void main( String args[] ) throws InterruptedException {

        UsefulObjectClass obj = new UsefulObjectClass(immortals);
        obj.printName();
        obj = null;

        System.out.println(immortals.size());

        Runtime.getRuntime().gc();

        // Sleep the main thread so that the garbage collector thread performs finalization
        Thread.sleep(1000);

        if (immortals.size() == 1) {
            System.out.println("Useful object saved from garbage collection.");
        }

        System.out.println("exiting");
    }
}

class UsefulObjectClass {

    HashSet<UsefulObjectClass> immortals;

    public UsefulObjectClass(HashSet<UsefulObjectClass> immortals) {
        this.immortals = immortals;
    }

    @Override
    public void finalize() {
        System.out.println("I am being finalized.");
        immortals.add(this);
    }

    public void printName() {
        System.out.println("Hi, I am a useful object.");
    }
}
