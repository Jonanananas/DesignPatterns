package com.factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus kissa = new Kissa();
        AterioivaOtus oppilas = new Oppilas();
        opettaja.aterioi();
        kissa.aterioi();
        oppilas.aterioi();
    }
}
