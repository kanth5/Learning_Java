package com.interview.classes;

public class ConstructorEx1 {
    public static void main( String args[] ) {
        (new SpecialPerson()).print();
    }
}

class SpecialPerson {

    String fullName = init();
    String name = "batman";

    public SpecialPerson() {
        System.out.println("In constructor method");
        name = "superMan";
    }

    private String init() {
        System.out.println("In init method");
        return name;
    }

    public void print() {
        System.out.println("In print method");
        System.out.println(fullName);
    }
}
