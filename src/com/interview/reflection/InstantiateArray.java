package com.interview.reflection;

import java.lang.reflect.Array;

class InstantiateArray {
    public static void main( String args[] ) {
        int[] array = (int[]) Array.newInstance(int.class, 10);

        for (int i = 0; i < 10; i++)
            array[i] = i;

        for (int i = 0; i < 10; i++)
            System.out.println(array[i]);
    }
}
