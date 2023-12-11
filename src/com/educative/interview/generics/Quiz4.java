package com.educative.interview.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Quiz4 {
    public static void main(String args[]) {
        List<Object> list = new ArrayList<>();
        list.add(new Integer(5));
        list.add(new Double(77.23));
        list.add("randomString");
        notVeryUsefulMethod(list);
    }

    static void notVeryUsefulMethod(Collection<?> collection) {
        for (Object obj : collection) {
            System.out.println(obj.getClass());
            System.out.println(obj.toString());
        }
    }
}

// The above method compiles and is being passed in a collection of type unknown. When we loop over the elements of the collection, we can only
// invoke the methods of the Object class on them.