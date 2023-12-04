package com.educative.interview.methods;

import java.util.ArrayList;
import java.util.List;

public class PassByRef {

    // Constructor
    public PassByRef(int n) {
        List<Integer> superList=null;
        allocate(superList, n);
        System.out.println("superList value is : " + superList);
    }

    // Method that does initialization
    void allocate(List<Integer> list, int n) {
        list = new ArrayList<>(n);
        System.out.println("list value is : " + list + " and its size is : " + list.size());
    }

    public static void main(String[] args) {
        PassByRef pbr = new PassByRef(10);
    }
}
