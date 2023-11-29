package com.interview.classes;

// A class that is defined in a block is called a local class. A block is a group of zero or more statements
// between balanced braces. Usually, local classes are defined inside a method, though they can also be defined
// inside a for loop or even an if statement. Local classes do have access to members of their enclosing class.
// They can also access local variables, but they need to be declared final. When local classes use variables
// in the scope of the outer class, they are said to have captured the variable.

class LocalClassExample {
    public static void main( String args[] ) {

        String name = "mainClass";

        // Declare our local class
        class LocalClass {
            String myName = "superFineLocalClass";

            public LocalClass(String name) {
                this.myName = name;
            }

            public void print() {
                System.out.println("My name is " + myName + " and I am enclosed by " + name);
            }
        }

        LocalClass lc1 = new LocalClass("test");
        LocalClass lc2 = new LocalClass("rest");

        lc1.print();
        lc2.print();

    }
}