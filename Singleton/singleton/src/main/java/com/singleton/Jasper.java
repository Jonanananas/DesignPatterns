package com.singleton;

public class Jasper {
    
    private Jeans jeans;
    private TShirt tShirt;
    private Cap cap;
    private Shoes shoes;
    ClothesFactory clothesFactory;

    public Jasper(ClothesFactory clothesFactory) {
        System.out.println("Jasper vaihtaa vaatteita.");
        jeans = clothesFactory.wearJeans();
        tShirt = clothesFactory.wearTShirt();
        cap = clothesFactory.wearCap();
        shoes = clothesFactory.wearShoes();
    }

    @Override
    public String toString() {
        return "Jasper: Minulla on päälläni " + jeans + ", " + tShirt + ", " + cap + " and " + shoes;
    }
}