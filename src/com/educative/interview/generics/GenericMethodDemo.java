package com.educative.interview.generics;

class GenericMethodDemo {

    <T> void printType(T item) {

        System.out.println(item);

    }

    public static void main( String args[] ) {
        GenericMethodDemo demo = new GenericMethodDemo();
        demo.<String>printType("string");
        demo.<Integer>printType(5);
        demo.printType(23.23f);
    }


}