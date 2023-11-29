package com.interview.classes;

class SuperDemo {
    public static void main( String args[] ) {
        (new ChildClass()).accessHiddenFields();
    }
}

class ChildClass extends ParentClass implements AnInterface {

    int counter = 0;

    public ChildClass() {
        // invoking parent class's constructor
        // using the super keyword
        super(9);
    }

    public void accessHiddenFields() {
        // accessing parent class's counter field which gets
        // hidden with the local counter field.
        super.counter++;
        counter++;
        System.out.println("subclass counter: " + counter + " parent class counter: " + super.counter);

        // accessing the interface's default method which is hidden
        AnInterface.super.accessHiddenFields();
    }
}



interface AnInterface {

    default void accessHiddenFields() {
        System.out.println("Default method of AnInterface invoked.");
    }
}

class ParentClass {

    protected int counter;

    public ParentClass(int val) {
        this.counter = val;
    }
}