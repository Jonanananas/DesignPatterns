package com.abstractfactoryjavareflection;

public class BossClothesFactory implements ClothesFactory {
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