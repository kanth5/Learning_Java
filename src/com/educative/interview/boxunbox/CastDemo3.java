package com.educative.interview.boxunbox;

class CastDemo3 {
    public static void main( String args[] ) {
        Integer[] intArray = CastDemo3.<Integer>createArray(10);
        //Number[] intArray = CastDemo3.<Integer>createArray(10);
    }

    static <T extends Number> T[] createArray(int size) {
        T[] array = (T[]) new Number[size];
        return array;
    }
}
