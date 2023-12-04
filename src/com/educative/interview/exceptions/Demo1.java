package com.educative.interview.exceptions;

import java.io.Closeable;
import java.io.IOException;

class Demo1 {
    public static void main( String args[] ) {

        try {
            tryWithResources();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println();
        }

        try {
            tryWithFinally();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println();
        }

    }

    static void tryWithResources() {

        try (SomeMediaClass sc = new SomeMediaClass()) {
            sc.read();
        } catch (IOException ioe) {
        }
    }

    static void tryWithFinally() throws Exception {

        SomeMediaClass sc = new SomeMediaClass();
        Throwable t = null;
        try {
            sc.read();
        } catch (Exception e) {
            t = e;
        } finally {
            // clean-up code
            sc.close(t);
        }
    }
}

class SomeMediaClass implements Closeable {

    public void close() throws IOException {
        throw new IOException();
    }

    // This method exists so that in the finally block
    // we are able to add a suppressed exception
    public void close(Throwable t) throws IOException {
        IOException ioe = new IOException();
        ioe.addSuppressed(t);
        throw ioe;
    }

    public void read() {
        throw new NullPointerException();
    }
}