package com.abstractfactory;

public class App {
    public static void main(String[] args) {
        Jasper jasper = new Jasper(new AdidasClothesFactory());
        System.out.println(jasper);
        System.out.println("Jasper valmistuu insinööriksi.");
        jasper = new Jasper(new BossClothesFactory());
        System.out.println(jasper);
    }
}
