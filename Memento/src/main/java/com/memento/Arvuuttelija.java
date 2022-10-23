package com.memento;

import java.util.concurrent.ThreadLocalRandom;

public class Arvuuttelija {
    public void liityPeliin(Client client) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 5);
        System.out.println("The random number for client " + client.getClientName() + " is " + randomNumber + "!");
        client.setObj(new Memento(randomNumber));
        client.start();
    }

    public synchronized boolean checkNumber(Object obj, int guessNumber, String name) throws InterruptedException {
        Memento memento = (Memento) obj;
        if (memento.correctNumber == guessNumber) {
            System.out.println("Client " + name + " guessed the number " + guessNumber + " which was correct!");
            return true;
        }
        System.out.println("Client " + name + " guessed the number " + guessNumber + " which was incorrect.");
        return false;
    }

    private class Memento {
        private int correctNumber;

        public Memento(int correctNumber) {
            this.correctNumber = correctNumber;
        }
    }
}