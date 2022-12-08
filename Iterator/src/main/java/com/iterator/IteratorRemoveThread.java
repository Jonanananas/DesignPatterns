package com.iterator;

import java.util.Iterator;

public class IteratorRemoveThread extends Thread {
    Iterator<Integer> it;
    Collection collection;

    public IteratorRemoveThread(Collection collection) {
        it = collection.getIntList().iterator();
        this.collection = collection;
    }

    public void run() {
        while (it.hasNext()) {
            System.out.println(Thread.currentThread().getName() + ": " + it.next());
            it.remove();
        }
    }
}
