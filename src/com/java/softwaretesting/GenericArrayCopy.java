package com.java.softwaretesting;

import java.util.Arrays;

public class GenericArrayCopy {

    Integer[] iArray1 = new Integer[5];
    Integer[] iArray2 = new Integer[5];

    public static <T> T[] arrayConcat(T[] first, T[] second) {
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    public static void main(String[] args) {

        int i = 1;

    }
}
