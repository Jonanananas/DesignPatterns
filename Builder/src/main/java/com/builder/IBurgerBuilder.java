package com.builder;

public interface IBurgerBuilder {
    public abstract void createNewBurgerProduct();

    public abstract void buildBun();

    public abstract void buildSauce();

    public abstract void buildTopping();

    public abstract Object getBurger();
}