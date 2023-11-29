package com.java.threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class PickFruitsWithRecursiveTask {

    public static void main(String[] args) {

        AppleTree[] appleTrees = AppleTree.newTreeGarden(12);
        ForkJoinPool pool = ForkJoinPool.commonPool();

        PickFruitTask task = new PickFruitTask(appleTrees,0,appleTrees.length - 1);
        int result = pool.invoke(task);

        System.out.println();
        System.out.println("Total apples picked " + result);
    }

    public static class PickFruitTask extends RecursiveTask<Integer> {

        private final AppleTree[] appleTrees;
        private final int startInclusive;
        private final int endInclusive;

        private final int taskThreshold = 4;

        public PickFruitTask(AppleTree[] appleTrees, int startInclusive, int endInclusive) {
            this.appleTrees = appleTrees;
            this.startInclusive = startInclusive;
            this.endInclusive = endInclusive;
        }

        @Override
        protected Integer compute() {

            if (endInclusive - startInclusive < taskThreshold) {
                return doCompute();
            }

            int midPoint = startInclusive + (endInclusive - startInclusive)/2;

            PickFruitTask leftSum = new PickFruitTask(appleTrees, startInclusive, midPoint);
            PickFruitTask rightSum = new PickFruitTask(appleTrees, midPoint+1, endInclusive);

            rightSum.fork();
            return leftSum.compute() + rightSum.join();

        }

        protected int doCompute() {
            return IntStream.rangeClosed(startInclusive, endInclusive)
                    .map(i-> {
                        try {
                            return appleTrees[i].pickApples();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .sum();
        }
    }

//    public static void main(String[] args) {
//        AppleTree[] appleTrees = AppleTree.newTreeGarden(12);
//        ForkJoinPool pool = ForkJoinPool.commonPool();
//
//        PickFruitTask task = new PickFruitTask(appleTrees, 0, appleTrees.length - 1);
//        int result = pool.invoke(task);
//
//        System.out.println();
//        System.out.println("Total apples picked: " + result);
//    }
//
//    public static class PickFruitTask extends RecursiveTask<Integer> {
//
//        private final AppleTree[] appleTrees;
//        private final int startInclusive;
//        private final int endInclusive;
//
//        private final int taskThreshold = 4;
//
//        public PickFruitTask(AppleTree[] array, int startInclusive, int endInclusive) {
//            this.appleTrees = array;
//            this.startInclusive = startInclusive;
//            this.endInclusive = endInclusive;
//        }
//
//        @Override
//        protected Integer compute() {
//            if (endInclusive - startInclusive < taskThreshold) {
//                return doCompute();
//            }
//            int midpoint = startInclusive + (endInclusive - startInclusive) / 2;
//
//            PickFruitTask leftSum = new PickFruitTask(appleTrees, startInclusive, midpoint);
//            PickFruitTask rightSum = new PickFruitTask(appleTrees, midpoint + 1, endInclusive);
//
//            rightSum.fork(); // computed asynchronously
//
//            return leftSum.compute()// computed synchronously: immediately and in the current thread
//                    + rightSum.join();
//        }
//
//        protected Integer doCompute() {
//            return IntStream.rangeClosed(startInclusive, endInclusive)//
//                    .map(i -> {
//                        try {
//                            return appleTrees[i].pickApples();
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                    })//
//                    .sum();
//        }
//    }
}
