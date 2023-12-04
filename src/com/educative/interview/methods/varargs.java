package com.educative.interview.methods;

//The type name is followed by three dots, a space, and then the variable name.
//The varargs variable is treated like an array.
//The varargs variable must appear at the last in the method signature.
//As a consequence of the above, there can only be a single varargs in a method signature.

public class varargs {

    public static void main(String[] args) {
        childrenNames("aaa","bbb","ccc","ddd");
        System.out.println("---");
        childrenNames();
    }

    public static void childrenNames(String... names) {
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);
    }
}
