package com.builder;

class Waiter {
    private IBurgerBuilder burgerBuilder;

    public void setBurgerBuilder(IBurgerBuilder pb) {
        burgerBuilder = pb;
    }

    public void constructBurger() {
        burgerBuilder.createNewBurgerProduct();
        burgerBuilder.buildBun();
        burgerBuilder.buildSauce();
        burgerBuilder.buildTopping();
    }
}