package com.decorator;

public class MozzarellaDecorator extends PizzaDecorator {
    public MozzarellaDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    private int mozzarellaPrice = 3;

    @Override
    public int getPrice() {
        return super.getPrice() + mozzarellaPrice;
    }
}
