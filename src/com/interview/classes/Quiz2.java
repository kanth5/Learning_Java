package com.interview.classes;

import java.util.ArrayList;
import java.util.List;

public class Quiz2 {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> ints = new ArrayList<>();

        // If List<Integer> was a subtype of List<Number>
        // then we could do the following

        //List<Number> nums = ints; // won't compile

        List<Number> nums_1 = new ArrayList<>();

        // Now we could store a Double in an ArrayList of
        // Integer.
        nums_1.add(9.9d);

        // A user tries to get an Integer out of the
        // presumably Integer arraylist but gets a
        // ClassCastException

        //Integer i = (Integer) nums_1.get(0);

        System.out.println(nums_1.getClass());
        System.out.println(nums_1.get(0).getClass());
        Double d = (Double) nums_1.get(0);
        Number n = nums_1.get(0);
        Object o = nums_1.get(0);

        System.out.println(n);
        System.out.println(d);
        System.out.println(o);
    }
}

