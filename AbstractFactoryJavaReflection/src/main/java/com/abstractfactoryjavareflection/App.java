package com.abstractfactoryjavareflection;

import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class factory = Class.forName("com.abstractfactoryjavareflection.AdidasClothesFactory");
        Jasper jasper = new Jasper((ClothesFactory)factory.getDeclaredConstructor().newInstance());
        System.out.println(jasper);
        System.out.println("Jasper valmistuu insinööriksi.");
        factory = Class.forName("com.abstractfactoryjavareflection.BossClothesFactory");
        jasper = new Jasper((ClothesFactory)factory.getDeclaredConstructor().newInstance());
        System.out.println(jasper);
    }
}
