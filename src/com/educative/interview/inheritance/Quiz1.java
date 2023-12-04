package com.educative.interview.inheritance;

// Any method inherited from a class or a superclass is invoked over any default method inherited
// from an interface.

public class Quiz1 {

    public static void main(String[] args) {

        Bilingual b = new Bilingual();
        b.converse();

    }
}

class Persian {

    public void whatsUp() {
        System.out.println("che khabar?");
    }
}

interface AlienLanguage {

    default void whatsUp(){
        System.out.println("yada yadda, more yadda yaddda");
    }
}

class Bilingual extends Persian implements AlienLanguage {

    public void converse() {
        whatsUp();
        AlienLanguage.super.whatsUp();
    }

}