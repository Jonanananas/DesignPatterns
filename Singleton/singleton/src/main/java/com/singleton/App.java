package com.singleton;

public class App {
    public static void main(String[] args) {
        Jasper jasper = new Jasper(AdidasClothesFactory.getInstance());
        System.out.println(jasper);
        System.out.println("Jasper valmistuu insinööriksi.");
        jasper = new Jasper(BossClothesFactory.getInstance());
        System.out.println(jasper);
    }
}
