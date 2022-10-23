package com.chainofresponsibility;

public class HeadOfUnitPower extends RaiseApprovalPower {
    private final double MINIMUMBOUND = 2;
    private final double MAXIMUMBOUND = 5;

    public void processRequest(PayRaiseRequest request) {
        if (request.getAmount() < MAXIMUMBOUND && request.getAmount() > MINIMUMBOUND) {
            System.out.println(
                    "The Head of Unit can approve a " + request.getAmount() + "% raise.");
        } else {
            super.processRequest(request);
        }
    }
}