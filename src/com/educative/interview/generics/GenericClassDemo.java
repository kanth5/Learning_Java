package com.educative.interview.generics;

public class GenericClassDemo {

    public static void main(String[] args) {

        (new MyPrinter<Integer>()).print(Integer.valueOf(555));

        (new MyPrinter<String>()).print("welcome");

        (new MyPrinter<Object>()).print(new GenericClassDemo());
    }
}

class MyPrinter<T> {

    T t;

    void print(T t) {
        System.out.println("printing " + t.toString());
    }
}
