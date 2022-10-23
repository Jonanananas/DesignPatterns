package com.chainofresponsibility;

public abstract class RaiseApprovalPower {
    private RaiseApprovalPower successor;

    public void setSuccessor(RaiseApprovalPower successor) {
        this.successor = successor;
    }

    public void processRequest(PayRaiseRequest request) {
        if (successor != null)
            successor.processRequest(request);
    }
}