package com.educative.java8.interfaces;

public class StaticMethodDemo implements Vehicle {

    public static void main(String[] args) {

        Vehicle.printSomething();
        StaticMethodDemo smd = new StaticMethodDemo();

        smd.printAnother();

    }
}
