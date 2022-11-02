package com.builder;

public class McDonaldsBurger {
    private Bun bun;
    private Sauce sauce;
    private Topping topping;

    public void setBun(Bun bun) {
        this.bun = bun;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public String toString() {
        return "McDonald's burger with a " + bun + " bun, a " + sauce + " sauce and a " + topping + " topping.";
    }
}