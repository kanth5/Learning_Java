package com.interview.inheritance;

class DiamondProblem {
    public static void main( String args[] ) {
        (new MultiLingual()).sayHello();

        Punjabi1 p = new MultiLingual();
        Marathi1 m = new MultiLingual();

        p.sayHello();
        m.sayHello();
    }
}

interface Language {

    void sayHello();

}

interface Punjabi extends Language1 {

    String lang = "punjabi";

    default void sayHello() {
        System.out.println("O Kiddaan");
    }

}

interface Marathi extends Language1 {

    String lang = "Marathi";

    default void sayHello() {
        System.out.println("Namaskaar");
    }

}

class MultiLingual implements Punjabi1, Marathi1 {

    // Must provide implementation for the sayHello
    // method, otherwise the code will not compile
    // even though both the interfaces provide
    // default implementations
    // UNCOMMENT THE BELOW METHOD FOR SUCCESSFUL COMPILATION
    public void sayHello() {
        System.out.println("I forgot how to say hello in both " + Marathi.lang  + " & " + Punjabi.lang);
    }

}