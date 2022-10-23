package com.chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        ManagerPower manager = new ManagerPower();
        HeadOfUnitPower headOfUnit = new HeadOfUnitPower();
        CEOPower ceo = new CEOPower();
        manager.setSuccessor(headOfUnit);
        headOfUnit.setSuccessor(ceo);
        // Press Ctrl+C to end.
        try {
            while (true) {
                System.out.println("Enter a pay raise percentage to find out who can approve it:");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.processRequest(new PayRaiseRequest(d));
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}