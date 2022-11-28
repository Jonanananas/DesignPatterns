package com.iterator;

import java.util.Iterator;

public class IteratorSharedThread extends Thread {
    Iterator<Integer> it;
    String name;
    Collection collection;

    public IteratorSharedThread(Collection collection, String name) {
        it = collection.getIntList().iterator();
        this.name = name;
        this.collection = collection;
    }

    public void run() {
        while (collection.getIt().hasNext()) {
            System.out.println(name + ": " + collection.getIt().next());
        }
    }
}
