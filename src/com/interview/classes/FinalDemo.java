package com.interview.classes;

class FinalDemo {

    static final int[] array = new int[5];

    public static void main( String args[] ) {
        System.out.println(array[0]);
        changeArrayContents(0, 9);
        System.out.println(array[0]);
    }

    // Allowed
    static void changeArrayContents(int  i, int val) {
        array[i] = val;
    }

    // Not allowed and will not compile

//    static void changeArray(){
//        array = new int[10];
//    }

}