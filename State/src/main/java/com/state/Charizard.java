package com.state;

class Charizard extends EvolutionState {
    private static Charizard INSTANCE = null;

    private Charizard() {
    }

    public static Charizard getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Charizard();
        }
        return INSTANCE;
    }

    private int experience = 0;
    private int maxhealth = 20;
    private int health = maxhealth;

    void battle(Pokemon p) {
        if (health <= 0) {
            System.out.println("Charizard is tired and cannot battle. Heal it to recover.");
            return;
        }
        System.out.println("Charizard won the battle by using the move Flamethrower!");
        health -= 1;
        if (health < 0)
            health = 0;
        experience += 2;
        System.out.println("Charizard gained 2 experience and lost 1 health. Charizard has " + experience
                + " experience and " + health + " health now.");
    }

    void heal() {
        if (health == maxhealth) {
            System.out.println("Charizard is already at full health!");
            return;
        }
        int healthGained = 5;
        if (health + 5 > maxhealth) {
            healthGained -= (health + 5) % maxhealth;
        }
        health += 5;
        if (health > maxhealth)
            health = maxhealth;
        System.out.println("Charizard gained " + healthGained + " health. It has " + health + " health now.");
    }

    void roar() {
        System.out.println("Charizard roars: \"GYAOOOH!!!\"");
    }

    void printStatus() {
        System.out.println("Charizard has " + experience
                + " experience and " + health + " health.");
    }
}
