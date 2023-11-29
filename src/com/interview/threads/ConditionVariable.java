package com.interview.threads;

import java.util.concurrent.locks.ReentrantLock;

class ConditionVariable {
    public static void main( String args[] ) throws InterruptedException {
        MisuseOfReentrantLock misuse = new MisuseOfReentrantLock();
        Thread thread1 = new Thread(() -> misuse.method1());

        Thread thread2 = new Thread(() -> misuse.method2());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class MisuseOfReentrantLock {
    Boolean flag = true;
    ReentrantLock reentrantLock = new ReentrantLock();

    void method1() {

        reentrantLock.lock();

        while (flag) {

            try {
                Thread.sleep(1000);
                flag = false;
            } catch (InterruptedException ie) {
                // Don't ignore in production
            }
        }
        System.out.println("Thread 1 finishes successfully");
    }


    void method2() {

        reentrantLock.unlock();

        // Never gets printed
        System.out.println("Thread 2 finishes successfully");
    }
}