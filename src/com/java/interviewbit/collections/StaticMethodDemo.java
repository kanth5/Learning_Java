package com.java.interviewbit.collections;

public class StaticMethodDemo {
    public static void main(String args[]) {

        Base_Class.static_display();
        Derived_Class.static_display();

        System.out.println("\n");

        Base_Class obj1 = new Base_Class();
        Base_Class obj2 = new Derived_Class();
        Derived_Class obj3 = new Derived_Class();

        obj1.static_display();
        obj2.static_display();
        obj3.static_display();
    }
}

class Base_Class {
    public static void static_display() {
        System.out.println("Base_Class::static_display");
    }
}

class Derived_Class extends Base_Class {
    public static void static_display() {
        System.out.println("Derived_Class::static_display");
    }
}