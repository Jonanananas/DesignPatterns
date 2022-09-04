package com.abstractfactory;

public class TShirt {
    String merkki;

    public TShirt(String merkki){
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return merkki + " t-paita";
    }
}