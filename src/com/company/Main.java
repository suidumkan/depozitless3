package com.company;

public class Main {

    public static void main(String[] args) {
           BankAccaunt b1 = new BankAccaunt();
           b1.deposit(10000.0);

           while (true)
               try {
                   b1.withDraw(6000);
        } catch (LimitException e) {
                   System.out.println(e.getMessage());

                   break;
               }
    }
}
