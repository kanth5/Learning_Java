package com.interview.inheritance;

class Quiz3 {
    public static void main( String args[] ) {

        (new Spanish()).sayHello();

        Language3 lg = new Spanish();
        lg.sayHello();
    }
}

class Language3 {

    static String lang = "base language";

    static protected void printLanguage() {
        System.out.println(lang);
    }

    protected Language3 sayHello() {
        System.out.println("----");
        return this;
    }
}

class Spanish extends Language3 {

    static String lang = "Spanish";

    static protected void printLanguage() {
        System.out.println(lang);
    }

    protected Language3 sayHello() {
        System.out.println("Ola!");
        return this;
    }
}