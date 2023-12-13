package com.educative.interview.generics;

class GenericArrayDemo {
    public static void main( String args[] ) {
        String[] strArray = GenericArrayDemo.<String>createGenericArray(String.class, 10);
        System.out.println(strArray.length);

        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        useGenericArray(intArray,10);
    }

    @SuppressWarnings("unchecked")
    static <T> T[] createGenericArray(Class<T> type, int size) {

        // Causes an unchecked cast warning
        T[] arr = (T[]) java.lang.reflect.Array.newInstance(type, size);
        return arr;
    }

    // 1. Initialize an Object array and cast it to the generic type like below
    // items = (T[]) new Object[size];

    // 2. Instead of declaring an T[] array, declare an Object[] array and cast to generic type when retrieving objects from the array.

    static <T> void useGenericArray(T[] t, int size){

        Object[] items = t;

        for(Object item: items) {
            T i = (T) item;
            System.out.println(i);
        }

    }

}