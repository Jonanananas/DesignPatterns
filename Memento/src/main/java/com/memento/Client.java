package com.memento;

import java.util.concurrent.ThreadLocalRandom;

public class Client extends Thread {
    private String name;
    private Object obj;
    private Arvuuttelija arv;

    public Client(Arvuuttelija arv, String name) {
        this.name = name;
        this.arv = arv;
        arv.liityPeliin(this);
    }

    public String getClientName() {
        return name;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public void run() {
        try {
            while (!arv.checkNumber(obj, ThreadLocalRandom.current().nextInt(1, 5), name))
                ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}