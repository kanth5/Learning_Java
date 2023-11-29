package com.java.collections.examples;

class StaticNestedClassDemo {
    private static String str = "SoftwareTestingHelp";
    private String str1 = "Another String";

    //Static nested class
    static class NestedStaticClass {
        //non-static method
        public void display() {
            System.out.println("Static string in OuterClass: " + str);
        }
    }

    public static void main(String args[]) {

        StaticNestedClassDemo.NestedStaticClass obj =
                new StaticNestedClassDemo.NestedStaticClass();

        obj.display();

        StaticNestedClassDemo obj1 = new StaticNestedClassDemo();

        System.out.println(obj1.str1);
    }
}