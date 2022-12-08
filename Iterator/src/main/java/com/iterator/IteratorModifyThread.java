package com.iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorModifyThread extends Thread {
    Iterator<Integer> it;
    Collection collection;

    public IteratorModifyThread(Collection collection) {
        it = collection.getIntList().iterator();
        this.collection = collection;
    }

    public void run() {
        int index = 17;
        List<Integer> intList = collection.getIntList();

        while (it.hasNext()) {
            System.out.println(Thread.currentThread().getName() + ": " + it.next());

            intList.remove(index);
            index--;
        }
    }
}
