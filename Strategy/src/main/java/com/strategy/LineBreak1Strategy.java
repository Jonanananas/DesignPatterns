package com.strategy;

import java.util.List;
import java.util.Iterator;

class LineBreak1Strategy implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        String result = "";
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            result += it.next() + "\n";
        }
        return result;
    }
}
