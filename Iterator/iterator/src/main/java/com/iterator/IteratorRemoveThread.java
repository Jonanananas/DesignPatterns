package com.iterator;

import java.util.Iterator;

public class IteratorRemoveThread extends Thread {
    Iterator<Integer> it;
    String name;
    Collection collection;

    public IteratorRemoveThread(Collection collection, String name) {
        it = collection.getIntList().iterator();
        this.name = name;
        this.collection = collection;
    }

    public void run() {
        while (it.hasNext()) {
            System.out.println(name + ": " + it.next());
            it.remove();
        }
    }
}
