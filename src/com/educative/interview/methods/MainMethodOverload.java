package com.educative.interview.methods;

public class MainMethodOverload {
    public static void main( String args[] ) {
        System.out.println( "Traditional main method" );
        main("Hi There");
        main();
    }

    public static void main( String singleArg) {
        System.out.println( "Method with single arg" );
    }

    public static void main( ) {
        System.out.println( "Method with no args" );
    }
}
