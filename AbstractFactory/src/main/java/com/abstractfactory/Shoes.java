package com.abstractfactory;

public class Shoes {
    String merkki;

    public Shoes(String merkki){
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return merkki + " kengät";
    }
}