package com.educative.interview.generics;

import java.util.*;

class ErasureDemo1 {
    public static void main( String args[] ) {

        // Raw type
        ArrayList al = new ArrayList();

        // ArrayList of Strings
        ArrayList<String> strs = new ArrayList<>();

        // ArrayList of ArrayList of Strings
        ArrayList<ArrayList<String>> lstOfStringLsts = new ArrayList<>();

        System.out.println(al.getClass());
        System.out.println("al.getClass().equals(strs.getClass()) = " + al.getClass().equals(strs.getClass()));
        System.out.println("al.getClass().equals(lstOfStringLsts.getClass()) = " + al.getClass().equals(lstOfStringLsts.getClass()));

    }
}