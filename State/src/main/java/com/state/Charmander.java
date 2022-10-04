package com.state;

class Charmander extends EvolutionState {
    private static Charmander INSTANCE = null;

    private Charmander() {
    }

    public static Charmander getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Charmander();
        }
        return INSTANCE;
    }

    private int experience = 0;
    private int maxhealth = 10;
    private int health = maxhealth;

    void battle(Pokemon p) {
        if (health <= 0) {
            System.out.println("Charmander is tired and cannot battle. Heal it to recover.");
            return;
        }
        System.out.println("Charmander won the battle by using the move Ember!");
        health -= 5;
        if (health < 0)
            health = 0;
        experience += 4;
        System.out.println("Charmander gained 4 experience and lost 5 health. Charmander has " + experience
                + " experience and " + health + " health now.");
        if (experience >= 10) {
            System.out.println("Charmander evolves to Charmeleon!");
            evolve(p, Charmeleon.getInstance());
        }
    }

    void heal() {
        if (health == maxhealth) {
            System.out.println("Charmander is already at full health!");
            return;
        }
        int healthGained = 5;
        if (health + 5 > maxhealth) {
            healthGained -= (health + 5) % maxhealth;
        }
        health += 5;
        if (health > maxhealth)
            health = maxhealth;
        System.out.println("Charmander gained " + healthGained + " health. It has " + health + " health now.");
    }

    void roar() {
        System.out.println("Charmander roars: \"Rawrrrrr!\"");
    }

    void printStatus() {
        System.out.println("Charmander has " + experience
                + " experience and " + health + " health.");
    }
}