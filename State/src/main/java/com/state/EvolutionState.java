package com.state;

abstract class EvolutionState {
    // void evolve(Pokemon p) {
    // p.evolve();
    // }

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

    // void activeOpen(Pokemon c) {
    // }

    // void passiveOpen(Pokemon c) {
    // }

    // void close(Pokemon c) {
    // }

    // void synchronize(Pokemon c) {
    // }

    // void acknowledge(Pokemon c) {
    // }

    // void send(Pokemon c) {
    // }

    // void transmit(Pokemon c, TCPOctetStream){}

    // void changeState(Pokemon c, TCPState s) {
    // c.changeState(s);
    // }
}
