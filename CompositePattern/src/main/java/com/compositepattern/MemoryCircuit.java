package com.compositepattern;

public class MemoryCircuit implements ComputerPart {
    int price = 100;

    public int getPrice() {
        return price;
    }

    public void addPart(ComputerPart shape) {
        throw new RuntimeException("Cannot add a part to a noncompound part");
    }
}
