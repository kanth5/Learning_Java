package com.educative.interview.classes.DemoPackage2;

import com.educative.interview.classes.DemoPackage1.DP1ProtectedVar;

public class Demo3 extends DP1ProtectedVar {

    public static void main(String[] args) {

        Demo3 d3 = new Demo3();

        // Protected members of a class in another package are accessible within subclass here

        d3.getDP1ProtectedName();

    }

}
