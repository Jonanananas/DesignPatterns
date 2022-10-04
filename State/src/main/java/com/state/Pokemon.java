package com.state;

public class Pokemon {
    private EvolutionState evoState;

    public Pokemon() {
        evoState = Charmander.getInstance();
    }

    public void battle() {
        evoState.battle(this);
    }

    public void heal() {
        evoState.heal();
    }

    public void roar() {
        evoState.roar();
    }

    public void printStatus() {
        evoState.printStatus();
    }

    protected void evolve(EvolutionState s) {
        evoState = s;
    }
}
