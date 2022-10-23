package com.chainofresponsibility;

public class CEOPower extends RaiseApprovalPower {
    private final double MINIMUM = 5;

    public void processRequest(PayRaiseRequest request) {
        if (request.getAmount() >= MINIMUM) {
            System.out.println(
                "The CEO can approve a " + request.getAmount() + "% raise.");
        } else {
            super.processRequest(request);
        }
    }
}