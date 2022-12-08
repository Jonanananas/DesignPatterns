package com.iterator;

public class IteratorSharedThread extends Thread {
    Collection collection;

    public IteratorSharedThread(Collection collection) {
        this.collection = collection;
    }

    public void run() {
        while (collection.getIt().hasNext()) {
            System.out.println(Thread.currentThread().getName() + ": " + collection.getIt().next());
        }
    }
}
