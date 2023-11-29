package com.java.examples;

public class FinalVariable
{
        public static void main(String[] args) {
            final int i;
            i = 20;
            int j = i + 20;
//            i = j + 30;
            System.out.println(i + " " + j);
        }
}
