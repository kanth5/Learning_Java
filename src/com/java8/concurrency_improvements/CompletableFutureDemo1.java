package com.java8.concurrency_improvements;

import java.util.concurrent.*;

public class CompletableFutureDemo1 {

    public static void main(String args[]) {

        // Passing a runnable to runAsync() method.

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("Doing some processing " + Thread.currentThread().getName());
        });

        System.out.println("This will print immediately " + Thread.currentThread().getName());

        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("This will print after 5 seconds " + Thread.currentThread().getName());

//        Executor executor = Executors.newFixedThreadPool(5);
//
//        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
//            try {
//                TimeUnit.SECONDS.sleep(5);
//            } catch (InterruptedException e) {
//                throw new IllegalStateException(e);
//            }
//            System.out.println("Doing some processing again " + Thread.currentThread().getName());
//        } ,
//                executor);
//
//        System.out.println("This will print immediately again " + Thread.currentThread().getName());
//
//        try {
//            future1.get();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("This will print after 5 seconds again " + Thread.currentThread().getName());

    }
}