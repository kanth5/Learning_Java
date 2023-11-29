package com.interview.methods;

public class PassByValue {

    public static void main( String args[] ) {
        (new PassByValue()).passByValue();
    }

    void passByValue() {

        float gravity = 9.8f;
        receiveByVale(gravity);
        System.out.println("Gravity acceleration = " + gravity);
    }

    void receiveByVale(float gravity) {
        // Attempt to change gravity
        gravity = 10f;
    }
}
