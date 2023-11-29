package com.java8.interfaces;

public interface Vehicle {

    static void printSomething() {
        System.out.println("Inside Static Method of Vehicle Interface");
    }

    default void printAnother() {
        System.out.println("Inside Default Method of Vehicle Interface");
    }
}
