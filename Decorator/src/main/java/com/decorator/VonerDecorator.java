package com.decorator;

public class VonerDecorator extends PizzaDecorator {
    public VonerDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    private int vonerPrice = 4;

    @Override
    public int getPrice() {
        return super.getPrice() + vonerPrice;
    }
}
