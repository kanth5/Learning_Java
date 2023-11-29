package com.java.examples;

public class ArrayLimitTest {

    public static void main(String[] args) {

        int[] n1 = new int[0];
        boolean[] n2 = new boolean[-200];
//        double[] n3 = new double[2241423798];
        char[] ch = new char[20];

        System.out.println(n1.length);

        n1[0] = 1;

        System.out.println(n1[0]);

    }
}
