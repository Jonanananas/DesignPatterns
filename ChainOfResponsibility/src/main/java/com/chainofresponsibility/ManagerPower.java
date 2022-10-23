package com.chainofresponsibility;

public class ManagerPower extends RaiseApprovalPower {
    private final double MAXIMUM = 2;

    public void processRequest(PayRaiseRequest request) {
        if (request.getAmount() <= MAXIMUM) {
            System.out.println(
                    "The Manager can approve a " + request.getAmount() + "% raise.");
        } else {
            super.processRequest(request);
        }
    }
}