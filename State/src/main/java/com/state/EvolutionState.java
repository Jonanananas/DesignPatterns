package com.state;

abstract class EvolutionState {
    void battle(Pokemon p) {
    }

    void heal() {
    }

    void roar() {
    }

    void printStatus() {
    }

    void evolve(Pokemon c, EvolutionState s) {
        c.evolve(s);
    }
}
