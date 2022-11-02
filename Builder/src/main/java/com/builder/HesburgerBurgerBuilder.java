package com.builder;

class HesburgerBurgerBuilder implements IBurgerBuilder {
    private HesburgerBurger burger;

    public void createNewBurgerProduct() {
        burger = new HesburgerBurger();
    }

    public HesburgerBurger getBurger() {
        return burger;
    }

    public void buildBun() {
        burger.setBun("plain");
    }

    public void buildSauce() {
        burger.setSauce("mild");
    }

    public void buildTopping() {
        burger.setTopping("cheddar cheese + salad + chicken");
    }
}