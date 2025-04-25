package com.OOPsConcepts.BankAccountSystem;

public class Savings extends User{
    public void interestCalculator(double balance){
        double interest = (balance * 10.23412 * 3)/100;
        System.out.println("Interest for the time period of 3 years : "+interest);
        System.out.println("Total balance after 3 years : "+(balance+interest));
    }
}
