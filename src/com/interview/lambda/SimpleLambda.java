package com.interview.lambda;

public class SimpleLambda implements Runnable {

    public static void main(String[] args) {

        RaiseToPower square = (x) -> {return x*x;};
        RaiseToPower cube = (x) -> {return x*x*x;};

        System.out.println(square.RaiseToX(5));
        System.out.println(cube.RaiseToX(5));

        Runnable f = () -> System.out.println("Hi There from f");
        Runnable g = new SimpleLambda();

        f.run();
        g.run();

        CrunchNumbers cn1 = (j,k) -> {
            System.out.println((j%k)==0 ? "Exactly Divisible" : "Not Divisible");
        };

        CrunchNumbers cn2 = (int j,int k) -> {
            System.out.println((j%k)==0 ? "Exactly Divisible" : "Not Divisible");
        };

        CrunchNumbers cn3 = (j,k) -> System.out.println((j%k)==0 ? "Exactly Divisible" : "Not Divisible");

        cn1.work(15,5);
        cn2.work(17,3);
        cn3.work(16,4);
    }

    @Override
    public void run() {
        System.out.println("Hello there from g");
    }
}

interface RaiseToPower {

    double RaiseToX(int x);
}

interface CrunchNumbers {

    void work(int a, int b);
}