package com.java.interviewbit;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringExample {

    public static void main(String[] args) {

        String s1 = "Hi";
        String s2 = "Hi";
        String s3 = "Hello";
        String s4 = new String("Hi");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println(s1==s4);

        String s5 = "Bye Bye Bye";
        String[] result = s5.split(" ");

        for (int i=0 ; i < result.length ; i++) {
            System.out.println(result[i]);
        }

        System.out.println(s5.contains("Bye"));

        System.out.println(s5.subSequence(0,5));

        StringJoiner sj = new StringJoiner(",", "[", "]");

        System.out.println(sj.add(s1));
        System.out.println(sj.add(s3));
        System.out.println(sj.add(s5));

        byte[] byteArray = s5.getBytes();
        char[] charArray = new char[s5.length()];

        System.out.println(Arrays.toString(byteArray));

        s5.getChars(0,s5.length(),charArray,0);

        System.out.println(Arrays.toString(charArray));
    }
}
