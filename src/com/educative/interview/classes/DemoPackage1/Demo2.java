package com.educative.interview.classes.DemoPackage1;

public class Demo2 extends DP1ProtectedVar {

    public static void main(String[] args) {

        Demo2 d2 = new Demo2();

        // Protected members of a class in this package are accessible within a subclass here

        d2.getDP1ProtectedName();
    }
}
