package com.iterator;

public class IteratorSharedRemoveThread extends Thread {
    Collection collection;

    public IteratorSharedRemoveThread(Collection collection) {
        this.collection = collection;
    }

    public void run() {
        while (collection.getIt().hasNext()) {
            System.out.println(Thread.currentThread().getName() + ": " + collection.getIt().next());
            collection.getIt().remove();
        }
    }
}
