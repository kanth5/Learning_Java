package com.educative.interview.classes;

class ArrayObjectDemo {
    public static void main( String args[] ) {

        ArrayObjectDemo[] array = new ArrayObjectDemo[1];
        array[0] = new ArrayObjectDemo();

        if( array[0] instanceof Object) {
            System.out.println( "Demonstration is instance of Object");
        }

        if( array instanceof Object) {
            System.out.println( "Array is instance of Object");
        }
    }
}