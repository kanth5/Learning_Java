package com.interview.exceptions;

import java.io.FileNotFoundException;

class FinallyDemo {
    public static void main( String args[] ) {
        System.out.println( process(2) );
    }

    static int process(int val) {

        try {
            if (val == 1)
                // checked exception
                throw new FileNotFoundException();
            if (val == 2)
                // Runtime Exception
                throw new NullPointerException();
            if (val == 3)
                // Error Exception
                throw new StackOverflowError();
        } catch (Error | FileNotFoundException | IllegalArgumentException | ArrayIndexOutOfBoundsException | NullPointerException ex) {
            System.out.println(ex);
            return -1;

        } finally {
            System.out.println("In finally block");
        }

        return 0;
    }

}
