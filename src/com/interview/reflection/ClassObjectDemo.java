package com.interview.reflection;

import java.util.LinkedList;
import java.util.Queue;

class ClassObjectDemo {
    public static void main( String args[] ) throws ClassNotFoundException {

        // Object data types

        Queue<Integer> q = new LinkedList<>();
        Class clazz = q.getClass();
        System.out.println(clazz.getSimpleName());

        String str = "Educative is helpful";
        Class clazz1 = str.getClass();
        System.out.println(clazz1.getCanonicalName());

        Enum gender = Gender.Female;
        Class clazz2 = gender.getClass();
        System.out.println(clazz2.getCanonicalName());

        // Primitive Data Type

        Class clazz3 = int.class;
        System.out.println(clazz3.getCanonicalName());

        // Array objects

        int[] array = new int[10];
        System.out.println(array.getClass().getCanonicalName());
        System.out.println(int[].class.getSimpleName());

        // Without any instance of an object

        Class clazz4 = Class.forName("java.lang.String");
        System.out.println(clazz4.getSimpleName());
        Class clazz5 = "".getClass();
        System.out.println(clazz5.equals(clazz4));

        int[] intArray = new int[10];
        String name = intArray.getClass().getName();
        Class clazz6 = Class.forName(name);
        System.out.println(clazz6.getSimpleName());

    }
}

enum Gender {
    Male,
    Female,
    Transgender,
    Unknown
}
