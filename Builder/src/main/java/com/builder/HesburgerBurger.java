package com.builder;

public class HesburgerBurger {
    private String bun = "";
    private String sauce = "";
    private String topping = "";

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String toString() {
        return "Hesburger burger with a " + bun + " bun, a " + sauce + " sauce and a " + topping + " topping.";
    }
}
