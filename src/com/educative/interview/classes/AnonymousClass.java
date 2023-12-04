package com.educative.interview.classes;

// Anonymous class implementing the Comparator interface. The class is declared and instantiated at the same time.

public class AnonymousClass {

    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                System.out.println("Extended the thread class");
            }
        };
        t.start();
        System.out.println(t.getName() + t.getId());
    }
}

/* Anonymous class implementing an interface */

//    Comparator myCustomComparator = new Comparator<Integer>() {
//
//        public int compare(Integer i1, Integer i2) {
//
//            return (int)Math.pow(-1, i1) * (i1 - i2);
//        }
//    };
//
//    PriorityQueue<Integer> q = new PriorityQueue<Integer>(myCustomComparator);

/* Anonymous class extending another class */

//    Thread t = new Thread() {
//
//        @Override
//        public void run() {
//            System.out.println("I just extended the thread class.");
//        }
//    };
//
//    t.start();