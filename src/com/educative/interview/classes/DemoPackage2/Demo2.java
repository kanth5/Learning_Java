package com.educative.interview.classes.DemoPackage2;

//import com.educative.interview.classes.DemoPackage1.DefaultClassDP1;
import com.educative.interview.classes.DemoPackage1.PublicClassDP1;

public class Demo2 {

    public static void main(String[] args) {

        // Public class belonging to another package is accessible here

        PublicClassDP1 pcdp1 = new PublicClassDP1();

        pcdp1.getNameDP1();

        // Default class belonging to another package is NOT accessible here

        // DefaultClassDP1 dcdp1 = new DefaultClassDP1();

    }
}
