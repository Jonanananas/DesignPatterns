package com.compositepattern;

public class NetworkCard implements ComputerPart {
    int price = 90;

    public int getPrice() {
        return price;
    }

    public void addPart(ComputerPart shape) {
        throw new RuntimeException("Cannot add a part to a noncompound part");
    }
}
