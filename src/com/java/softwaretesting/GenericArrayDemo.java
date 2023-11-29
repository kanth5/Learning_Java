package com.java.softwaretesting;

import java.util.Arrays;

class GenericArrayDemo {

    public static void main(String[] args) {
        final int length = 5;

        //integer array object from Generic_Array class
        Generic_Array<Integer> intArray = new Generic_Array(length);

        for (int i = 0; i < length; i++)
            intArray.set(i, i * 2);

        System.out.println("Integer Array elements:" + intArray);

        // String array object from Generic_Array class
        Generic_Array<String> strArray = new Generic_Array(length);

        for (int i = 0; i < length; i++)
            strArray.set(i, String.valueOf((char) (i + 97)));

        System.out.println("String Array Elements:" + strArray);
    }
}

//Generic Array Class
class Generic_Array<E> {

    private final Object[] gen_Array;
    public final int length;

    public Generic_Array(int length) {
        gen_Array = new Object[length];
        this.length = length;
    }

//    E get(int i) {
//        final E e = (E) gen_Array[i];
//        return e;
//    }

    void set(int i, E e) {

        gen_Array[i] = e;
    }

    @Override
    public String toString() {
        return Arrays.toString(gen_Array);
    }
}