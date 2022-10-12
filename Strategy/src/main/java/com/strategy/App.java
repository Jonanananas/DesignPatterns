package com.strategy;

public class App {
    public static void main(String[] args) {
        Context c = new Context(new LineBreak1Strategy());

        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");
        c.add("f");
        c.add("g");
        c.add("h");

        System.out.println("Line break after every string:");
        c.printList();

        c.setStrategy(new LineBreak2Strategy());
        System.out.println("Line break after every other string:");
        c.printList();

        c.setStrategy(new LineBreak3Strategy());
        System.out.println("Line break after every third string:");
        c.printList();
    }
}
