package com.java.examples;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        FooImplementation fi = new FooImplementation();
        System.out.println(fi.HelloWorld());
//        System.out.println(fi.CustomMessage(“Hi”));
        System.out.println(Foo.CustomMessage("Hi"));
        fi.bar();
    }

}
