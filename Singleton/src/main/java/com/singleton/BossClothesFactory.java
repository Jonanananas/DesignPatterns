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

    public BossJeans wearJeans() {
        return new BossJeans();
    }

    public BossTShirt wearTShirt() {
        return new BossTShirt();
    }

    public BossCap wearCap() {
        return new BossCap();
    }

    public BossShoes wearShoes() {
        return new BossShoes();
    }
}