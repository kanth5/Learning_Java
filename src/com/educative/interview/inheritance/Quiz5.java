package com.educative.interview.inheritance;

class Quiz5 {
    public static void main( String args[] ) {
        (new FlyingMan()).fly();
    }
}

interface SuperPower {

    void fly();
}

class JetPack {

    public void fly() {
        System.out.println("fly away");
    }
}

class FlyingMan extends JetPack implements SuperPower {

    void identify() {
        System.out.println("I am a flying man.");
    }
}
