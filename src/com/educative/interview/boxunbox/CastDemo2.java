package com.educative.interview.boxunbox;

class CastDemo2 {
    public static void main( String args[] ) {
        // Attempt to create a generic array
        // results in a ClassCastException
        String[] array = CastDemo2.<String>createArray(5);
        // Object[] array = CastDemo2.<String>createArray(5);
    }

    static <T> T[] createArray(int size) {
        T[] array = (T[]) new Object[size];
        System.out.println(array.getClass());
        return array;
    }
}