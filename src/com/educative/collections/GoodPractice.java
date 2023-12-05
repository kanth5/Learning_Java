package com.educative.collections;

// Whenever we create a Collection, we should provide the type of object it can hold. This is called parameterized type Collection.
// A raw type Collection does not have any type of safety, and an object of any type can be inserted into it. In the below example,
// we have created a raw type ArrayList. Elements of Integer and String type are added to it. This code will compile but will fail at
// run-time with ClassCastException. This would have been avoided if we had used parameterized type.

import java.util.ArrayList;
import java.util.List;

public class GoodPractice {

    public static void doSomeWork(List list) {
        list.add("India");
    }

    public static void main(String args[]) {
        List list = new ArrayList();
        list.add(10);
        list.add(20);
        doSomeWork(list);

        Integer i = (Integer) list.get(2);
    }
}
