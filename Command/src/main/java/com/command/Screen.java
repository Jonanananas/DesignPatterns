package com.command;

public class Screen {
    int centerPoint = 0;

    public void screenUp() {
        centerPoint += 1;
        System.out.println("The screen rose by 1 cm and is now " + centerPoint + " cm from the starting point.");
    }

    public void screenDown() {
        centerPoint -= 1;
        System.out.println("The screen lowered by 1 cm and is now " + centerPoint + " cm from the starting point.");
    }
}
