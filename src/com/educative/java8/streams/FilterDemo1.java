package com.educative.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list.stream().forEach(p-> System.out.print(" " + p));
        System.out.println();

        list.stream().filter(n->n>5).forEach(p-> System.out.print(" " + p));
        System.out.println();

        list.stream().forEach(p-> System.out.print(" " + p));
    }
}
