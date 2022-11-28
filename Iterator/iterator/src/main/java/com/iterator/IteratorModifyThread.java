package com.iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorModifyThread extends Thread {
    Iterator<Integer> it;
    String name;
    Collection collection;

    public IteratorModifyThread(Collection collection, String name) {
        it = collection.getIntList().iterator();
        this.name = name;
        this.collection = collection;
    }

    public void run() {
        int index = 0;
        List<Integer> intList = collection.getIntList();

        while (it.hasNext()) {
            System.out.println(name + ": " + it.next());

            intList.set(index, intList.get(index) * 10);
            index++;
        }
    }
}
