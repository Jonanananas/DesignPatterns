package com.iterator;

import java.util.Iterator;

public class IteratorThread extends Thread {
    Iterator<Integer> it;
    Collection collection;

    public IteratorThread(Collection collection) {
        it = collection.getIntList().iterator();
        this.collection = collection;
    }

    public void run() {
        while (it.hasNext()) {
            System.out.println(Thread.currentThread().getName() + ": " + it.next());
        }
    }
}
