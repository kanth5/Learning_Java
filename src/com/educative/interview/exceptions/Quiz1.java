package com.educative.interview.exceptions;

import java.io.IOException;

public class Quiz1 {

    public static void main(String[] args) throws IOException {

//        try {
//            throw new IllegalArgumentException("World");
//        } finally {
//            throw new IOException("Hello");
//        }

        try {
            throw new IllegalArgumentException("World");
        } catch (IllegalArgumentException iae) {
            throw new NullPointerException();
        } finally {
            throw new IOException("Hello");
        }

    }
}
