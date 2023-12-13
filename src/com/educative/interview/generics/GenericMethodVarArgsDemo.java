package com.educative.interview.generics;

class GenericMethodVarArgsDemo {
    public static void main( String args[] ) {
        GenericMethodVarArgsDemo.<String>someMethod("a", "b", "c");

        GenericMethodVarArgsDemo.<Integer>someMethod(1 ,2 ,3);
    }

    @SuppressWarnings("unchecked")
    static <T> void someMethod(T... args) {
        T[] inputs = args;
        for (T t : inputs)
            System.out.println(t);
        System.out.println(inputs.getClass());
    }
}