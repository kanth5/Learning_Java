package com.java.softwaretesting;

public class ThreadExample {

    public static void main(String[] args) {

        Thread T1 = new Thread("Thread1");
        Thread T2 = new Thread("Thread2");

        System.out.println(T1.getId() + " : " + T1.getName() + " : " + T1.isAlive());
        System.out.println(T2.getId() + " : " + T2.getName() + " : " + T2.isAlive());

        T1.start();
        T2.start();

        System.out.println(T1.getId() + " : " + T1.getName() + " : " + T1.isAlive());
        System.out.println(T2.getId() + " : " + T2.getName() + " : " + T2.isAlive());

        DoSomethingWithThread D1 = new DoSomethingWithThread("D1 thread");
        DoSomethingWithThread D2 = new DoSomethingWithThread("D2 thread");

        D1.start();
        D2.start();

    }
}

class DoSomethingWithThread extends Thread{

    String name;

    DoSomethingWithThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0; i < 10; i++) {
            System.out.println(name + "Value of i " + i);
        }
    }
}
