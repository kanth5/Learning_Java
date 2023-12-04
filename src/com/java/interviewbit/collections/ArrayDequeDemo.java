package com.java.interviewbit.collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class ArrayDequeDemo {

    public static void main(String args[])
    {
        Queue<String> color_queue = new ArrayDeque<String>();

        color_queue.add("red");
        color_queue.add("green");
        color_queue.add("blue");
        color_queue.add("cyan");
        color_queue.add("magenta");
        color_queue.add("yellow");

        color_queue.add("red");
        color_queue.add("green");

        System.out.println("Array Deque elements:");
        System.out.println(color_queue);
        System.out.println("head:"+color_queue.peek());
        System.out.println("After peeking elements in Array Deque:");
        Iterator itr=color_queue.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\n");
        color_queue.remove();
        System.out.println("After removing element, new head:"+color_queue.element());
        System.out.println("\n");
        color_queue.poll();
        System.out.println("After polling, Array Deque :");
        Iterator<String> itr2=color_queue.iterator();
        while(itr2.hasNext()) {
            System.out.print(itr2.next() + " ");
        }
        System.out.println("\n");
        System.out.println(color_queue.stream().count());

    }

}
