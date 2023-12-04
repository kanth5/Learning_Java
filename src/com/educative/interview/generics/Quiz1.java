package com.educative.interview.generics;

import java.util.LinkedList;

class Quiz1 {

    public static void main( String args[] ) {

        LinkedList<Integer> myList;
        myList = createList();

        myList.add(5);

    }

    static LinkedList createList(){

        return new LinkedList();
    }


}