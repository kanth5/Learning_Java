package com.interview.threads;

public class ThreadSafeDemo {

    public static void main(String[] args) throws InterruptedException {

        Sum s = new Sum();

        Thread t1 = new Thread((Runnable) s);
        Thread t2 = new Thread((Runnable) s);

        t2.start();
        t1.start();
    }
}

class Sum implements Runnable {

//  int total = 0;
//  Not thread safe if 'total' variable is uncommented above and commented in the below method

    @Override
    public void run() {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
            total += i;
        }
        System.out.println(total);
    }
}
