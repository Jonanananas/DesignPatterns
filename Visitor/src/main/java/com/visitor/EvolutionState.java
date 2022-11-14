package com.visitor;

abstract class EvolutionState {
    abstract void battle(Pokemon p, EvolutionCheckVisitor visitor);

    abstract void heal();

    abstract void roar();

    abstract int getExperience();

    abstract void printStatus();
}
