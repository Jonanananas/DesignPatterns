package com.visitor;

public interface EvolutionStateVisitor {
    void visit(Charizard charizard, Pokemon p);

    void visit(Charmeleon charmeleon, Pokemon p);

    void visit(Charmander charmander, Pokemon p);
}
