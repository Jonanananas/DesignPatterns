package com.builder;

public class Bun {
    private String bunType;

    public Bun(String bunType) {
        this.bunType = bunType;
    }

    @Override
    public String toString() {
        return bunType;
    }
}