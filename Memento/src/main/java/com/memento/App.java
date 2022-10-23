package com.memento;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Arvuuttelija arvuuttelija = new Arvuuttelija();
        Client client1 = new Client(arvuuttelija, "1");
        Client client2 = new Client(arvuuttelija, "2");
        Client client3 = new Client(arvuuttelija, "3");
    }
}
