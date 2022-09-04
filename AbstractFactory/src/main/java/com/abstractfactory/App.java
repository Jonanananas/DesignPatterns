package com.abstractfactory;

public class App {
    public static void main(String[] args) {
        Jasper outfit = new Jasper(new AdidasClothesFactory());
        System.out.println(outfit);
        System.out.println("Jasper valmistuu insinööriksi.");
        outfit = new Jasper(new BossClothesFactory());
        System.out.println(outfit);
    }
}
