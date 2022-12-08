package com.iterator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Collection col = new Collection();

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter a test number from 1 to 5:");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Iterate with the thread's own iterator:");
                    IteratorThread it = new IteratorThread(col);
                    IteratorThread it1 = new IteratorThread(col);
                    it.start();
                    it1.start();
                    break;
                case 2:
                    System.out.println("Share an iterator between threads:");
                    IteratorSharedThread itShared = new IteratorSharedThread(col);
                    IteratorSharedThread itShared1 = new IteratorSharedThread(col);
                    itShared.start();
                    itShared1.start();
                    break;
                case 3:
                    System.out.println("Iterate with the thread's own iterator and modify index values:");
                    IteratorModifyThread itModify = new IteratorModifyThread(col);
                    IteratorModifyThread itModify1 = new IteratorModifyThread(col);
                    itModify.start();
                    itModify1.start();
                    break;
                case 4:
                    System.out.println("Iterate with the thread's own iterator and remove indexes:");
                    System.out.println("This will cause a concurrent modification exception");
                    IteratorRemoveThread itRemove = new IteratorRemoveThread(col);
                    IteratorRemoveThread itRemove1 = new IteratorRemoveThread(col);
                    itRemove.start();
                    itRemove1.start();
                    break;
                case 5:
                    System.out.println("Share an iterator between threads and remove indexes:");
                    System.out.println("This will cause an illegal state exception");
                    IteratorSharedRemoveThread itSharedRemove = new IteratorSharedRemoveThread(col);
                    IteratorSharedRemoveThread itSharedRemove1 = new IteratorSharedRemoveThread(col);
                    itSharedRemove.start();
                    itSharedRemove1.start();
                    break;
                default:
                    System.out.println("Invalid test number!");
            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
        scan.close();
    }
}
