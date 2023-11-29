package com.interview.erasure;

import java.util.*;

class ErasureDemo1 {
    public static void main(String args[]) {

        // Raw type
        ArrayList al = new ArrayList();

        // ArrayList of Strings
        ArrayList<String> strs = new ArrayList<>();

        // ArrayList of ArrayList of Strings
        ArrayList<ArrayList<String>> lstOfStringLists = new ArrayList<>();

        System.out.println("al.getClass().equals(strs.getClass()) = " + al.getClass().equals(strs.getClass()));
        System.out.println("al.getClass().equals(lstOfStringLists.getClass()) = " + al.getClass().equals(lstOfStringLists.getClass()));

    }
}