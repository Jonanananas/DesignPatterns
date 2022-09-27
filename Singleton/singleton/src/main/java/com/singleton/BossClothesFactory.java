package com.singleton;

public class BossClothesFactory implements ClothesFactory {
    private static BossClothesFactory INSTANCE = null;

    private BossClothesFactory() {
    }

    public static BossClothesFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BossClothesFactory();
        }
        return INSTANCE;
    }

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