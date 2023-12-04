package com.educative.interview.threads;

// A classic newbie mistake is to synchronize on an object and then somewhere in the code reassign the object.
// We synchronize on a Boolean object in the first thread but sleep before we call wait() on the Boolean object.
// While the first thread is asleep, the second thread goes on to change the flag's value. When the first thread
// wakes up and attempts to invoke wait(), it is met with a <>IllegalMonitorState exception! The object the first
// thread synchronized on before going to sleep has been changed, and now it is attempting to call wait() on an
// entirely different object without having synchronized on it.

class Quiz1 {
    public static void main( String args[] ) throws InterruptedException {
        (new NewbieSynchronization()).example();
    }
}

class NewbieSynchronization {

    Boolean flag = new Boolean(true);

    public void example() throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {

            public void run() {
                synchronized (flag) {
                    try {
                        while (flag) {
                            System.out.println("First thread about to sleep");
                            Thread.sleep(5000);
                            System.out.println("Woke up and about to invoke wait()");
                            flag.wait();
                        }
                    } catch (InterruptedException ie) {

                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {

            public void run() {
                flag = false;
                System.out.println("Boolean assignment done.");
            }
        });

        t1.start();
        Thread.sleep(1000);
        t2.start();
        t1.join();
        t2.join();
    }
}
