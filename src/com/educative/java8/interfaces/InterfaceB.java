package com.educative.java8.interfaces;

public interface InterfaceB {
    default void printSomething() {
        System.out.println("I am inside Interface B");
    }
}
