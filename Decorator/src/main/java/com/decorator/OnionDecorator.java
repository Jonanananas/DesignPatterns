package com.decorator;

public class OnionDecorator extends PizzaDecorator {
    public OnionDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    private int onionPrice = 1;

    @Override
    public int getPrice() {
        return super.getPrice() + onionPrice;
    }
}
