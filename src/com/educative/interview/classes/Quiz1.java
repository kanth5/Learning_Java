package com.educative.interview.classes;

public class Quiz1 {
    public static void main( String args[] ) {

        B objB = new B();
        // Prints null instead of "Class B"
        objB.printName();

    }
}

class A {
    protected String name = null;

    public A() {
        init();
    }

    protected void init(){
        name = "class is A";
    }

    public void printName() {
        System.out.println(name);
    }

}


class B extends A {

    private final String newName;

    public B() {
        newName = "Class B";
    }

    @Override
    protected void init() {
        name = newName;
    }



}