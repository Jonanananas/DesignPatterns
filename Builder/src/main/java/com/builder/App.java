package com.builder;

public class App {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        IBurgerBuilder burgerBuilder = new HesburgerBurgerBuilder();
        waiter.setBurgerBuilder(burgerBuilder);
        waiter.constructBurger();
        HesburgerBurger hesburgerBurger = (HesburgerBurger) burgerBuilder.getBurger();
        System.out.println("A customer ordered a " + hesburgerBurger);

        burgerBuilder = new McDonaldsBurgerBuilder();
        waiter.setBurgerBuilder(burgerBuilder);
        waiter.constructBurger();
        McDonaldsBurger mcDBurger = (McDonaldsBurger) burgerBuilder.getBurger();
        System.out.println("A second customer ordered a " + mcDBurger);
    }
}
