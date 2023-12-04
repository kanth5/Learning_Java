package com.educative.interview.classes;

// An abstract class can't be instantiated, but it can be subclassed. An abstract class usually contains abstract
// and non-abstract methods that subclasses are forced to provide an implementation for. An abstract method is a
// method that is declared without an implementation. Any method marked abstract will force subclasses to provide
// an implementation for. Non-abstract methods will also have a method body that serves as the default implementation. Subclasses may choose to override the default implementation with their own. If a class includes abstract methods, then the class itself must be declared abstract.
// Abstract classes may also implement an interface but will not be required to provide an implementation for
// interface methods since it can't be instantiated. Below is an example Person class.

public abstract class AbstractPerson implements Comparable<AbstractPerson> {

    int age;
    String firstName;
    String lastName;
    String middleName;

    public AbstractPerson() {

    }

    public AbstractPerson(int age, String firstName, String middleName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Abstract method must be implemented by the subclass.
    abstract void printFullName();

    // Default implementation for defaultAge
    void printAge() {
        System.out.println();
    }
}
