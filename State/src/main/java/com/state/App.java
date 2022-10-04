package com.state;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        Scanner scanner = new Scanner(System.in);
        boolean playGame = true;

        System.out.println("You got a Pokemon called Charmander!");
        pokemon.printStatus();

        while (playGame) {
            System.out.println(
                    "What do you want to do next? Input:\n" +
                    "\"1\" to battle\n" +
                    "\"2\" to heal\n" +
                    "\"3\" to roar\n" +
                    "\"4\" to check your pokemon's status\n" +
                    "\"5\" to quit");
            try {
                int actionNr = scanner.nextInt();

                if (actionNr < 1 || actionNr > 5) {
                    System.out.println("Invalid input!");
                } else {
                    switch (actionNr) {
                        case 1:
                            pokemon.battle();
                            break;
                        case 2:
                            pokemon.heal();
                            break;
                        case 3:
                            pokemon.roar();
                            break;
                        case 4:
                            pokemon.printStatus();
                            break;
                        case 5:
                            playGame = false;
                            System.out.println("Ending game.");
                            break;
                        default:
                            playGame = false;
                            System.out.println("Ending game.");
                            break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
                scanner.next();
                continue;
            }
        }
        scanner.close();
    }
}
