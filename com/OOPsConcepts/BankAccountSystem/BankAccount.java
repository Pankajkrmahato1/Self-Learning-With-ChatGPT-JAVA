package com.OOPsConcepts.BankAccountSystem;

public class BankAccount {
    public double balance(double amount){
        return amount;
    }
    public double deposit(double amount, double balance){
        System.out.println("Deposited credited successfully : " +amount);
        System.out.println("Bank Balance :" +(balance+amount));
        return balance + amount;
    }
    public double withdraw(double amount, double balance){
        if(amount > balance)
            System.out.println("Insufficient funds unable to perform transaction");
        else {
            System.out.println("Withdrawal was successfull :" + amount);
            System.out.println("Bank balance : " +(balance-amount));
            return balance - amount;
        }
        return balance;
    }
}
