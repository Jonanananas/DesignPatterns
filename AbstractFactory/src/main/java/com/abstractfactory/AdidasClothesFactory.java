package com.abstractfactory;

public class AdidasClothesFactory implements ClothesFactory {
    public Jeans wearJeans() {
        return new Jeans("Adidas");
    }

    public TShirt wearTShirt() {
        return new TShirt("Adidas");
    }

    public Cap wearCap() {
        return new Cap("Adidas");
    }

    public Shoes wearShoes() {
        return new Shoes("Adidas");
    }
}