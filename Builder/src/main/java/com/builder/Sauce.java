package com.builder;

public class Sauce {
    private String sauceType;

    public Sauce(String sauceType) {
        this.sauceType = sauceType;
    }

    @Override
    public String toString() {
        return sauceType;
    }
}