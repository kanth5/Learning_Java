package com.interview.boxunbox;

// Arrays are covariant, meaning we can cast an array of a subtype to its super type but
// not vice versa. Arrays being covariant imply two things:

//An array of type T[] may contain elements of type T and its subtypes.
//An array of type S[] is a subtype of T[] if S is a subtype of T.

public class CastDemo1 {

    public static void main(String[] args) {

        String[] strarr = new String[10];
        Object[] objarr = (Object[])strarr;
//
//        objarr =strarr;
//
//        strarr[0] = "A";
//
//        System.out.println(objarr.length);
//        System.out.println(objarr[0]);
//        System.out.println(objarr == strarr);
//
//        Object[] objarr1 = new Object[10];
//        String[] strarr1 = (String[]) objarr1;

    }
}
