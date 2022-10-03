package com.decorator;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizzaToBeDecorated;

    public PizzaDecorator(Pizza pizzaToBeDecorated) {
        this.pizzaToBeDecorated = pizzaToBeDecorated;
    }
    
    public int getPrice() {
        return pizzaToBeDecorated.getPrice();
    }
}
