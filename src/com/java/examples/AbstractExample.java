package com.java.examples;

public class AbstractExample {

    public static void main(String[] args) {
        ScalarTopics st = new ScalarTopics();
        st.printMessage();
        st.methodA();

        ScalarAcademy sa = new ScalarAcademy();
        sa.printMessage();
        sa.methodA();
    }
}

abstract class InterviewBit {
    public abstract void printMessage();

    public void methodA() {
        System.out.println("Inside default method of the abstract class");
    }
}

class ScalarAcademy extends InterviewBit {
    public void printMessage() {
        System.out.println("Welcome to Scalar Academy By InterviewBit");
    }

    public void methodA() {
        System.out.println("Inside Method A from Scalar Academy");
    }
}

class ScalarTopics extends ScalarAcademy {
    public void printMessage() {
        System.out.println("Welcome to Scalar Topics By Scalar Academy");
        super.printMessage();
    }

    public void methodA() {
        System.out.println("Inside Method A from Scalar Topics");
    }
}