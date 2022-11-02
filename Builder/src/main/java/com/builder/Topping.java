package com.builder;

public class Topping {
    private String toppingType;

    public Topping(String toppingType) {
        this.toppingType = toppingType;
    }

    @Override
    public String toString() {
        return toppingType;
    }
}