package com.builder;

class McDonaldsBurgerBuilder implements IBurgerBuilder {
    private McDonaldsBurger burger;

    public void createNewBurgerProduct() {
        burger = new McDonaldsBurger();
    }

    public McDonaldsBurger getBurger() {
        return burger;
    }

    public void buildBun() {
        burger.setBun(new Bun("sesame seed"));
    }

    public void buildSauce() {
        burger.setSauce(new Sauce("hot"));
    }

    public void buildTopping() {
        burger.setTopping(
                new Topping("voner + vegan cheese"));
    }
}