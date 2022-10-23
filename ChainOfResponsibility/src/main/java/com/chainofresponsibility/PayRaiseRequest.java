package com.chainofresponsibility;

public class PayRaiseRequest {
    private double percentage;

    public PayRaiseRequest(double amount) {
        this.percentage = amount;
    }

    public double getAmount() {
        return percentage;
    }
}