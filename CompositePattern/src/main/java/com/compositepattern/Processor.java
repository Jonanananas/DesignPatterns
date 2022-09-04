package com.compositepattern;

public class Processor implements ComputerPart {
    int price = 1337;

    public int getPrice() {
        return price;
    }

    public void addPart(ComputerPart shape) {
        throw new RuntimeException("Cannot add a part to a noncompound part");
    }
}
