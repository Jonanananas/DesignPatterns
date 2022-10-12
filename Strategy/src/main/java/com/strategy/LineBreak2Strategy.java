package com.strategy;

import java.util.List;

class LineBreak2Strategy implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        String[] strings = list.toArray(new String[list.size()]);
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            result += strings[i];
            if ((i + 1) % 2 == 0) {
                result += "\n";
            }
        }
        return result;
    }
}
