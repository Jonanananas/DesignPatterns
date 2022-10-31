package com.visitor;

public class Pokemon {
    private EvolutionState evoState;
    private EvolutionCheckVisitor visitor;

    public Pokemon() {
        evoState = Charmander.getInstance();
        visitor = new EvolutionCheckVisitor();
    }

    public void battle() {
        evoState.battle(this, visitor);
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
