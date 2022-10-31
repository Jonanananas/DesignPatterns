package com.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");

        List<Image> imageFolder = new ArrayList<Image>();
        imageFolder.add(image1);
        imageFolder.add(image2);
        imageFolder.add(image3);

        try {
            while (true) {
                System.out.println("Press Ctrl+C or input something else than a number to end browsing.");
                System.out.println("Images: ");

                for (int i = 0; i < imageFolder.size(); i++) {
                    System.out.print((i + 1) + ": ");
                    imageFolder.get(i).showData();
                }
                System.out.print("Input an image's number to display the image: ");

                int userChoice = scan.nextInt();

                if (userChoice > imageFolder.size()) {
                    System.out.println("Image with that number does not exist!");
                } else {
                    imageFolder.get(userChoice - 1).displayImage();
                }
                System.out.println("");
            }
        } catch (Exception e) {
            System.exit(1);
        }
        scan.close();
    }
}
