package com.educative.interview.methods;

// Return empty arrays or Collections but not null from methods. If the developer invoking the method as a client forgets to check for
// the null case, it will cause his or her code to fail with a null pointer exception.

import java.util.*;

class Quiz1 {
    public static void main( String args[] ) {
        List<Integer> result = divisibleByTwo(-4);
        // The if check will throw NullPointerException
        if(result.size() > 0){
            // ... do some processing
        }
    }

    // Method returns all the numbers that are
    // divisible by 2 from 0 to n
    static List<Integer> divisibleByTwo(int n) {

        if (n < 0) return null;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                list.add(i);
        }

        return list;
    }
}