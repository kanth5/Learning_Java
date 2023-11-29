package com.java.softwaretesting;

import java.util.Arrays;

public class SimpleArrayCopy {

    static int[] iArray1 = new int[] {1,2,3,4,5};
    static int[] iArray2 = new int[] {11,22,33,44,55};

    public static void main(String[] args) {
        int[] iArray3 = Arrays.copyOf(iArray1,iArray1.length + iArray2.length);

        System.out.println("iArray3 length = " + iArray3.length);

        iArray3 = Arrays.copyOf(iArray1, 10);
        System.out.println("iArray3 contents : " + Arrays.toString(iArray3));
        iArray3 = Arrays.copyOfRange(iArray2, 0, 4);
        System.out.println("iArray3 contents : " + Arrays.toString(iArray3));

    }
}
