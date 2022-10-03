package com.decorator;

class Crust implements Pizza {
    private int crustPrice = 4;

    public int getPrice() {
        return crustPrice;
    }
}
