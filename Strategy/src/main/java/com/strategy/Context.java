package com.strategy;

import java.util.ArrayList;
import java.util.List;

class Context {
    private List<String> strings;
    private ListConverter strategy;

    public Context(ListConverter strategy) {
        this.strings = new ArrayList<String>();
        this.strategy = strategy;
    }

    public void add(String s) {
        strings.add(s);
    }

    public void printList() {
        System.out.println(strategy.listToString(strings));
    }

    public void setStrategy(ListConverter strategy) {
        this.strategy = strategy;
    }
}