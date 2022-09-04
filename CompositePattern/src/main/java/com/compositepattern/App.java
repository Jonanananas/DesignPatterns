package com.compositepattern;

public class App {
    public static void main(String[] args) {
        ComputerPart pcCase = new Case();
        ComputerPart motherboard = new Motherboard();

        motherboard.addPart(new MemoryCircuit());
        motherboard.addPart(new NetworkCard());
        motherboard.addPart(new Processor());

        ComputerPart graphicsCard = new GraphicsCard();

        pcCase.addPart(motherboard);
        pcCase.addPart(graphicsCard);

        System.out.print("The computer costs " + pcCase.getPrice() + " euros");
    }
}
