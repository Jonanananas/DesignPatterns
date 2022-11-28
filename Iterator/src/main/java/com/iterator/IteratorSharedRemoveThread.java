package com.iterator;

import java.util.Iterator;

public class IteratorSharedRemoveThread extends Thread {
    Iterator<Integer> it;
    String name;
    Collection collection;

    public IteratorSharedRemoveThread(Collection collection, String name) {
        it = collection.getIntList().iterator();
        this.name = name;
        this.collection = collection;
    }

    public void run() {
        while (collection.getIt().hasNext()) {
            System.out.println(name + ": " + collection.getIt().next());
            it.remove();
        }
    }
}
