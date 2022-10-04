package com.state;

class Charmeleon extends EvolutionState {
    private static Charmeleon INSTANCE = null;

    private Charmeleon() {
    }

    public static Charmeleon getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Charmeleon();
        }
        return INSTANCE;
    }

    private int experience = 0;
    private int maxhealth = 14;
    private int health = maxhealth;

    void battle(Pokemon p) {
        if (health <= 0) {
            System.out.println("Charmeleon is tired and cannot battle. Heal it to recover.");
            return;
        }
        System.out.println("Charmeleon won the battle by using the move Flamethrower!");
        health -= 5;
        if (health < 0)
            health = 0;
        experience += 3;
        System.out.println("Charmeleon gained 3 experience and lost 5 health. Charmeleon has " + experience
                + " experience and " + health + " health now.");
        if (experience >= 10) {
            System.out.println("Charmeleon evolves to Charizard!");
            evolve(p, Charizard.getInstance());
        }
    }

    void heal() {
        if (health == maxhealth) {
            System.out.println("Charmeleon is already at full health!");
            return;
        }
        int healthGained = 5;
        if (health + 5 > maxhealth) {
            healthGained -= (health + 5) % maxhealth;
        }
        health += 5;
        if (health > maxhealth)
            health = maxhealth;
        System.out.println("Charmeleon gained " + healthGained + " health. It has " + health + " health now.");
    }

    void roar() {
        System.out.println("Charmeleon roars: \"Roaaaaaaarh!\"");
    }

    void printStatus() {
        System.out.println("Charmeleon has " + experience
                + " experience and " + health + " health.");
    }
}
