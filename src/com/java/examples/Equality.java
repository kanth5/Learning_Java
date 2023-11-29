package com.java.examples;

public class Equality {

    public static void main(String[] args) {

        String str1= "My String 1";
        String str2= "My String 1";

        String str3="";
        String str4=null;

        String str5= new String("My String 1");

        System.out.println(str1==str2);

        System.out.println(str1==str5);

        System.out.println(str4);

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        // System.out.println(str4.hashCode()); //Null pointer exception
        System.out.println(str5.hashCode());

        System.out.println(str1.equals(str5));
    }
}
