package com.visitor;

public class EvolutionCheckVisitor implements
        EvolutionStateVisitor {
    public void visit(Charizard charizard, Pokemon p) {
        System.out.println("Charizard is the last stage of the evolution.");
    }

    public void visit(Charmeleon charmeleon, Pokemon p) {
        if (charmeleon.getExperience() < 10)
            return;
        System.out.println("Charmeleon evolves to Charizard!");
        charmeleon.evolve(p, Charizard.getInstance());
    }

    public void visit(Charmander charmander, Pokemon p) {
        if (charmander.getExperience() < 10)
            return;
        System.out.println("Charmander evolves to Charmeleon!");
        charmander.evolve(p, Charmeleon.getInstance());
    }
}
