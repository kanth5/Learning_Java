package com.educative.interview.classes;

// The primary purpose of nested classes is logically grouping related classes in one place
// and improving encapsulation. Say, you write a class to hold all the employees of a company.
// It may make sense to nest an employee iterator class as it iterates only on the objects of the
// employee class.


public class NestedClassDemo1 {

    static String constant = "Hello World";
    private String name = "John";
    public int age = 45;

    public static void main(String[] args) {
        (new NestedClassDemo1()).new InnerClass().getValuesFromOuter();
        new InnerStaticClass().getValuesFromOuter();
    }

    public class InnerClass {

        void getValuesFromOuter() {
            System.out.println(name);
            System.out.println(age);
        }
    }

    static class InnerStaticClass {

        void getValuesFromOuter() {
            System.out.println(constant);
        }
    }
}