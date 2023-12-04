package com.educative.java8.concurrency_improvements;

import java.util.concurrent.*;

public class CompletableFutureDemo2 {

    public static void main(String args[]) {

        // Create a future which returns an integer.
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Inside future's supplyAsync ...");
                System.out.println(Thread.currentThread().getName());
                System.out.println("Finished supplyAsync ...");
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return 50;
        });

        // Calling thenApply() which takes a Function as parameter.
        // It takes a number as input and returns double of number.
        CompletableFuture<Integer> resultFuture = future.thenApply(num -> {
            System.out.println("Inside result future's thenApply ...");
            System.out.println(Thread.currentThread().getName());
            System.out.println("Finished thenApply ...");
            return num * 2;
        });

        try {
            System.out.println(resultFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}