package com.singleton;

public class AdidasClothesFactory implements ClothesFactory {
    private static AdidasClothesFactory INSTANCE = null;

    private AdidasClothesFactory() {
    }

    public static AdidasClothesFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AdidasClothesFactory();
        }
        return INSTANCE;
    }

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