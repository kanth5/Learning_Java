package com.educative.interview.inheritance;

class Quiz2 {
    public static void main( String args[] ) {
        (new BiLingual()).converse();
    }
}

interface Language1 {

    default void sayHello() {
        System.out.println("01101000 01100101 01101100 01101100 01101111 ");
    }
}

interface Marathi1 extends Language1 {}

interface Punjabi1 extends Language1 {}

class BiLingual implements Punjabi1, Marathi1 {void converse() {sayHello();}}