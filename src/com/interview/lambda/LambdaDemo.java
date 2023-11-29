package com.interview.lambda;

import java.util.Comparator;
import java.util.PriorityQueue;

class LambdaDemo {
    public static void main( String args[] ) {

        Comparator<Integer> descendingComparator = (i1, i2) -> {
            return i2 - i1;
        };

        PriorityQueue<Integer> q1 = new PriorityQueue<>();

        PriorityQueue<Integer> q2 = new PriorityQueue<>(descendingComparator);

        // add integers to q in ascending order
        for(int i=0;i<=10;i++) {
            q1.add(i);
        }

        // add integers to q in ascending order
        for(int i=0;i<=10;i++) {
            q2.add(i);
        }

        System.out.println("\nPriority Queue 1 : ");

        // verify the numbers are printed in ascending order
        for(int i=0;i<=10;i++) {
            System.out.println(q1.poll());
        }

        System.out.println("\nPriority Queue 2 : ");

        // verify the numbers are printed in descending order
        for(int i=0;i<=10;i++) {
            System.out.println(q2.poll());
        }

    }
}