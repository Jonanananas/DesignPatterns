package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
    List<Integer> intList;
    Iterator<Integer> it;

    public Iterator<Integer> getIt() {
        return it;
    }

    public List<Integer> getIntList() {
        return intList;
    }

    public Collection() {
        intList = new ArrayList<Integer>();

        for (int i = 0; i < 18; i++) {
            intList.add(i);
        }

        it = intList.iterator();
    }
}
