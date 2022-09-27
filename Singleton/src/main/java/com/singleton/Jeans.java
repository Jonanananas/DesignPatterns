package com.singleton;

public class Jeans {
    String merkki;

    public Jeans(String merkki){
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return merkki + " farmarit";
    }
}