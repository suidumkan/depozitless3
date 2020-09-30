package com.company;

public class LimitException extends Exception {
    double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    double getRemainingAmount(){

        return remainingAmount;
    }
}
