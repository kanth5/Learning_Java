package com.java.interviewbit;

import java.util.HashSet;
import java.util.Set;

public class DoubleBraceDemo {
    public static void main(String[] args){
        Set<String> stringSets = new HashSet<String>();

//        {{
//            add("set1");
//        }};

        stringSets.add("set2");

        doSomething(stringSets);
    }
    private static void doSomething(Set<String> stringSets){
        System.out.println(stringSets);
        }
}