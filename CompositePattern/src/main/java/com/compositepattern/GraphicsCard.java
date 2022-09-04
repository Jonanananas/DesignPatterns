package com.compositepattern;

public class GraphicsCard implements ComputerPart {
    int price = 9999;

    public int getPrice() {
        return price;
    }

    public void addPart(ComputerPart shape) {
        throw new RuntimeException("Cannot add a part to a noncompound part");
    }
}
