package com.interview.exceptions;

import java.io.IOException;

class ChainedExceptionDemo {
    public static void main( String args[] ) {
        try {
            chainedExceptionsExample();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    static void chainedExceptionsExample() {

        try {
            throw new IOException();
        } catch (IOException ioe) {

            NullPointerException npe = new NullPointerException();
            npe.initCause(ioe);
            throw npe;
        }
    }

}
