package com.educative.interview.generics;

class CastTestDemo {
    public static void main( String args[] ) {

        CastTest<Float> test = new CastTest<>();

        // works fine
        test.castObject(5.5);

        // Both of the following statements compile but fail at runtime with ClassCastExceptions.
        // Uncomment the below lines to see the exception being generated at runtime.

        //test.castObject("won't work");
        //test.castGenericParam(5);
    }
}

class CastTest<T extends Number> {

    public void castObject(Object obj) {
        T t = (T) obj; // <--- issues a unchecked cast warning
        System.out.println(t);
    }

    public void castGenericParam(T t) {
        String i = (String) ((Object) t); // <--- No compile time warning
        System.out.println(i);
    }
}