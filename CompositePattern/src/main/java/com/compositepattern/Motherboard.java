package com.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Motherboard implements ComputerPart {
    int price = 100;
    List<ComputerPart> parts = new ArrayList<ComputerPart>();

    public void addPart(ComputerPart part) {
        parts.add(part);
    }

    public int getPrice() {
        int price = this.price;
        for(ComputerPart part : parts){
            price += part.getPrice();
        }
        return price;
    }
}
