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

    public AdidasJeans wearJeans() {
        return new AdidasJeans();
    }

    public AdidasTShirt wearTShirt() {
        return new AdidasTShirt();
    }

    public AdidasCap wearCap() {
        return new AdidasCap();
    }

    public AdidasShoes wearShoes() {
        return new AdidasShoes();
    }
}