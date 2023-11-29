package com.interview.threads;

class InterruptDemo {
    public static void main( String args[] ) throws InterruptedException {
        InterruptExample.example();
    }
}


class InterruptExample {

    static public void example() throws InterruptedException {

        final Thread sleepyThread = new Thread(new Runnable() {

            public void run() {
                try {
                    System.out.println("I am too sleepy... Let me sleep for an hour.");
                    Thread.sleep(1000 * 60 * 60);
                } catch (InterruptedException ie) {
                    System.out.println("A ---");
                    System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().isInterrupted());
                    System.out.println(Thread.interrupted());
                    System.out.println("B ---");
                    System.out.println("The interrupt flag is cleared : " + Thread.interrupted() + " " + Thread.currentThread().isInterrupted());
                    System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().isInterrupted());
                    System.out.println(Thread.interrupted());
                    System.out.println("C ---");
                    Thread.currentThread().interrupt();
                    System.out.println(Thread.interrupted());
                    System.out.println("D ---");
                    System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().isInterrupted());
                    System.out.println("Oh someone woke me up ! ");
                    System.out.println("The interrupt flag is set now : " + Thread.currentThread().isInterrupted() + " " + Thread.interrupted());
                    System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().isInterrupted());
                    System.out.println("E ---");
                }
            }
        });

        System.out.println(sleepyThread.getName());
        sleepyThread.start();

        System.out.println("About to wake up the sleepy thread ...");
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().isInterrupted());
        sleepyThread.interrupt();
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().isInterrupted());
        System.out.println("Woke up sleepy thread ...");

        sleepyThread.join();
    }
}