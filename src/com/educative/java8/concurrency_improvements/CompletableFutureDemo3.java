package com.educative.java8.concurrency_improvements;

import java.util.concurrent.*;

public class CompletableFutureDemo3 {

    public static void main(String args[]) {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Create a future which returns an integer.
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return 50;
        });

        // Calling thenApply() which takes a Function as parameter.
        // It takes a number as input and returns double of number.
        CompletableFuture<Integer> resultFuture = future.thenApplyAsync(num -> {
            System.out.println(Thread.currentThread().getName());
            return num *2;
        } , executor);

        try {
            System.out.println(resultFuture.get());
            executor.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}