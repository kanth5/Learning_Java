package com.java.threads;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class AppleTree {

    private final String treeLabel;
    private final int numberOfApples;

    public AppleTree(String treeLabel) {
        this.treeLabel = treeLabel;
        this.numberOfApples = 3;
    }

    public static AppleTree[] newTreeGarden(int size) {
        AppleTree[] appleTrees = new AppleTree[size];
        for (int i=0; i<size; i++) {
            appleTrees[i] = new AppleTree("Tree # " + i);
        }
        return appleTrees;
    }

    public int pickApples (String workerName) throws InterruptedException {

//        System.out.printf("%s started picking apples from %s \n",workerName,treeLabel);
        TimeUnit.SECONDS.sleep(1);
        System.out.printf("%s picked %d apples from %s \n",workerName,numberOfApples,treeLabel);

        return numberOfApples;
    }

    public int pickApples() throws InterruptedException {
        return pickApples(toLabel(Thread.currentThread().getName()));
    }

    private String toLabel(String threadName) {
        HashMap<String, String> threadNameToLabel = new HashMap<>();
        threadNameToLabel.put("ForkJoinPool.commonPool-worker-5", "Alice");
        threadNameToLabel.put("ForkJoinPool.commonPool-worker-19", "Bob");
        threadNameToLabel.put("ForkJoinPool.commonPool-worker-23", "Carol");
        threadNameToLabel.put("main", "Dan");

        return threadNameToLabel.getOrDefault(threadName, threadName);
    }
}

