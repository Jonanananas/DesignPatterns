package com.decorator;

public class App {
    public static void main(String[] args) {
        Pizza decoratedPizza1 = new MozzarellaDecorator(
                new TomatoDecorator(
                        new VonerDecorator(
                                new OnionDecorator(new Crust()))));

        Pizza decoratedPizza2 = new MozzarellaDecorator(
                new TomatoDecorator(
                        new OnionDecorator(new Crust())));

        Pizza decoratedPizza3 = new MozzarellaDecorator(
                new VonerDecorator(
                        new OnionDecorator(new Crust())));
        System.out.println("Pizza 1 Price: " + decoratedPizza1.getPrice());
        System.out.println("Pizza 2 Price: " + decoratedPizza2.getPrice());
        System.out.println("Pizza 3 Price: " + decoratedPizza3.getPrice());
    }
}
