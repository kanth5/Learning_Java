package com.interview.reflection;

class ClassLoaders {

    public static void main(String[] args) {

        System.out.println(new ClassLoaders().getClass().getClassLoader());

        System.out.println(String.class.getClassLoader());

        System.out.println("".getClass().getClassLoader());
    }
}
