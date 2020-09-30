package com.company;

public class BankAccaunt extends Exception  {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount = sum;
            System.out.println("на счете " + amount);
        }
    }
public void withDraw (int sum) throws LimitException {
    if (sum > amount) {
        throw new LimitException("не хватает деньги на счете ", amount);
    }
    amount = amount - sum;
    System.out.println("снимаем " + sum);
    System.out.println("остаток " + getAmount());
}
}
