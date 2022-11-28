package com.command;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command screenUp = new ScreenUpCommand(screen);
        Command screenDown = new ScreenDownCommand(screen);
        WallButton buttonUp = new WallButton(screenUp);
        WallButton buttonDown = new WallButton(screenDown);

        Scanner scan = new Scanner(System.in);
        boolean willContinue = true;

        while (willContinue) {
            try {
                System.out.print("Enter 1 to rise the screen, 2 to lower it and 3 to quit:");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        buttonUp.push();
                        break;
                    case 2:
                        buttonDown.push();
                        break;
                    case 3:
                        willContinue = false;
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
                scan.next();
            }
        }
        scan.close();
        System.out.print("Exiting...");
    }
}
