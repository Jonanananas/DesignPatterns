package com.decorator;

public class TomatoDecorator extends PizzaDecorator {
    public TomatoDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    private int tomatoPrice = 2;

    @Override
    public int getPrice() {
        return super.getPrice() + tomatoPrice;
    }
}
