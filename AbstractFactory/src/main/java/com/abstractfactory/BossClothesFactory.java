package com.abstractfactory;

public class BossClothesFactory implements ClothesFactory {
    public Jeans wearJeans() {
        return new Jeans("Boss");
    }

    public TShirt wearTShirt() {
        return new TShirt("Boss");
    }

    public Cap wearCap() {
        return new Cap("Boss");
    }

    public Shoes wearShoes() {
        return new Shoes("Boss");
    }
}