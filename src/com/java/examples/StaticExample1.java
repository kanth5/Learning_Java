package com.java.examples;

class StaticExample1 {
    int i;
    static int j;
    {
        System.out.println(" Instance Block 1. Value of i = "+i);
    }
    static{
        System.out.println(" Static Block 1. Value of j = "+j);
        method_2();
    }
    {
        i = 5;
    }
    static{
        j = 10;
    }
    StaticExample1(){
        System.out.println(" Welcome to InterviewBit ");
    }

    public static void main(String[] args){
        StaticExample1 ib = new StaticExample1();
        System.out.println("----");
        StaticExample1 ib2 = new StaticExample1();
    }
    public void method_1(){
        System.out.println(" Instance method. ");
    }
    static{
        System.out.println(" Static Block 2. Value of j = "+j);
    }
    {
        System.out.println(" Instance Block 2. Value of i = "+i);
        method_1();
    }
    public static void method_2(){
        System.out.println(" Static method. ");
    }
}