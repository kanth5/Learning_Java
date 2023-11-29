package com.interview.generics;

class GenericArrayDemo {
    public static void main( String args[] ) {
        String[] strArray = GenericArrayDemo.<String>createGenericArray(String.class, 10);
        System.out.println(strArray.length);
    }

    @SuppressWarnings("unchecked")
    static <T> T[] createGenericArray(Class<T> type, int size) {

        // Causes an unchecked cast warning
        T[] arr = (T[]) java.lang.reflect.Array.newInstance(type, size);
        return arr;
    }

}