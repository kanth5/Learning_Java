package com.interview.lambda;

// The question asks which one of the two overloaded compute methods will be invoked.
// This requires the compiler to determine what will be the type of the lambda expression () -> "done"
// being passed in. Lambda Expressions do not have an explicit type. Their type is inferred by looking
// at the target type of the context or situation. The target-type of an expression is the data type that
// the Java Compiler expects depending on where the expression appears.

// In the given snippet, the data type of the arguments of the two overloaded methods is called the target type.
// To determine the type of the lambda expression, the Java compiler uses the target type of the context or
// situation in which the lambda expression was found. It implies that lambda expressions can only be used in
// situations in which the Java compiler can determine a target type. Since the expression returns a string,
// the compiler matches the call with the compute method that accepts a type of Callable and thus the lambda
// expression () -> "done" is of type callable.

import java.util.concurrent.Callable;

class Quiz1 {
    public static void main( String args[] ) throws Exception{
        (new LambdaTargetType()).getWorking();
    }
}

class LambdaTargetType {

    public void getWorking() throws Exception {
        compute(() -> System.out.println("done"));
        System.out.println("Next");
        compute(() -> "done");
    }

    void compute(Runnable r) {
        System.out.println("Runnable invoked");
        r.run();
    }

    <T> void compute(Callable<T> c) throws Exception {
        System.out.println("Callable invoked");
        c.call();
    }
}