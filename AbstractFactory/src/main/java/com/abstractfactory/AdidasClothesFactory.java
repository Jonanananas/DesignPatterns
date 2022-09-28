package com.abstractfactory;

public class AdidasClothesFactory implements ClothesFactory {
    public Jeans wearJeans() {
        return new AdidasJeans();
    }

    public TShirt wearTShirt() {
        return new AdidasTShirt();
    }

    public Cap wearCap() {
        return new AdidasCap();
    }

    public Shoes wearShoes() {
        return new AdidasShoes();
    }
}