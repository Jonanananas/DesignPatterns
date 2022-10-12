package com.templatemethod;

import java.util.concurrent.ThreadLocalRandom;

class Pokemon extends Game {

    int[] pokemonHitpoints = { 10, 10 };

    boolean endGame, noWinner;
    int winnerId;

    void initializeGame() {
        if (playersCount != 2) {
            System.out.println("Wrong amount of players! This game requires 2 players.");
            interruptGame();
            return;
        }
    }

    void makePlay(int player) {
        int otherPlayerId;
        switch (player) {
            case 0:
                otherPlayerId = 1;
                break;
            case 1:
                otherPlayerId = 0;
                break;
            default:
                System.out.println("Invalid player id!");
                interruptGame();
                return;
        }
        if (endGame)
            return;
        int damage = ThreadLocalRandom.current().nextInt(1, 11);
        pokemonHitpoints[otherPlayerId] -= damage;
        System.out.println(
                "Player " + player + " damages player " + otherPlayerId + "'s pokemon for " + damage + " hitpoints!");
        if (pokemonHitpoints[otherPlayerId] <= 0) {
            pokemonHitpoints[otherPlayerId] = 0;
            winnerId = player;
            endGame = true;
        }
        System.out.println(
                "Player " + otherPlayerId + "'s pokemon has " + pokemonHitpoints[otherPlayerId] + " hitpoints left!\n");
    }

    boolean endOfGame() {
        return endGame;
    }

    void printWinner() {
        if (noWinner) {
            System.out.println("No winner.");
            return;
        }
        System.out.println("Player " + winnerId + " wins!");
    }

    void interruptGame() {
        noWinner = true;
        endGame = true;
    }
}