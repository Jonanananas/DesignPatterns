package com.factorymethod;

public class Kissa extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Kerma();
    };

}
