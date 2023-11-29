package com.interview.reflection;

// Enum objects can't be reflectively created. We can retrieve the list of enum constants using
// the getEnumConstants() method. An example appears below.

import java.util.concurrent.TimeUnit;

class EnumConstants {
    public static void main( String args[] ) {
        Class<TimeUnit> c = TimeUnit.class;
        TimeUnit[] consts = c.getEnumConstants();
        for (int i = 0; i < consts.length; i++)
            System.out.println(consts[i].toString());
    }
}