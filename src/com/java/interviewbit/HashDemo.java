package com.java.interviewbit;

public class HashDemo {

    public static void main(String[] args) {

        String str1 = new String("Hello");
        System.out.println(str1.hashCode());
        System.out.println(hash(str1));

//        int index = str1.hashCode(key) & (n-1)
//        System.out.println(str1 & 15);
    }

    static final int hash(Object key) {
        int h;
        System.out.println(key.hashCode());
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
