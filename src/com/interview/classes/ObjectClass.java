package com.interview.classes;

public class ObjectClass {

    public static void main( String args[] ) {
        System.out.println((new ObjectClass()) instanceof Object);
        System.out.println((new ObjectSubclass1()) instanceof Object);
        System.out.println((new ObjectSubclass2()) instanceof Object);
    }
    static class ObjectSubclass1 {

    }
}

class ObjectSubclass2 {

}