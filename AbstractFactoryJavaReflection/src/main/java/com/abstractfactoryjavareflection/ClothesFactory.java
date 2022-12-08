package com.abstractfactoryjavareflection;

public interface ClothesFactory {
    public abstract Jeans wearJeans();

    public abstract TShirt wearTShirt();

    public abstract Cap wearCap();

    public abstract Shoes wearShoes();
}