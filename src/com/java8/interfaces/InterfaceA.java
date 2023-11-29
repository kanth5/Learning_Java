package com.java8.interfaces;

public interface InterfaceA {
    default void printSomething() {
        System.out.println("I am inside Interface A");
    }
}
