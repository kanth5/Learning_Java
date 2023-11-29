package com.java.examples;

public class FooImplementation implements Foo {
    // Default Method - Optional to Override
    @Override
    public String HelloWorld() {
        return "Hello Java 8";
    }
    // Method Override
    @Override
    public void bar() {
        System.out.println("Hello World");
    }
}