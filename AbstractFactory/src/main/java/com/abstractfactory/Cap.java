package com.abstractfactory;

public class Cap {
    public String merkki;

    public Cap(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return merkki + " lippis";
    }
}