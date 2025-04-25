package com.OOPsConcepts.BankAccountSystem;

import java.util.Scanner;

public class AutomaticTellerMachine {
   static User obj = new User();
   static BankAccount bankAccount = new BankAccount();
   static Savings savings = new Savings();

    public static void main(String[] args){
        System.out.println("Welcome to JAVA BANK\n" +
                "Enter your name and age. We will generate\n" +
                "an account number for you\n");
        Scanner scanner = new Scanner(System.in);
        obj.setName(scanner.nextLine());
        System.out.println("Enter age");
        obj.setAge(scanner.nextInt());
        obj.setAccountNumber((int)((Math.random())*10000)+obj.getAge());
        bankAccount.balance(obj.getBalance());
        System.out.println("Enter your first deposit");
        obj.setBalance(scanner.nextDouble());

        System.out.println("Enter the tasks you want to achieve\n" +
                "Press 1. to View your details\n" +
                "Press 2. to perform a deposit\n" +
                "Press 3. to perform a withdrawal\n" +
                "Press 4. to calculate your interest\n" +
                "Press any other option to exit");

        int choice = scanner.nextInt();
       while (choice == 1 || choice == 2 || choice == 3|| choice == 4){
           if (choice ==1)
               viewDetails();
           else if (choice ==2)
               deposit();

           else if (choice ==3)
               withdrawal();
           else if (choice ==4)
               savings.interestCalculator(obj.getBalance());
            else {
               System.out.println("thank you");
               break;
           }
           System.out.println("Enter your choice");
           choice =scanner.nextInt();
       }
    }
    public static void viewDetails(){
        System.out.println("Name : "+obj.getName());
        System.out.println("Age : "+obj.getAge());
        System.out.println("Account Number : "+obj.getAccountNumber());
        System.out.println("Balance : "+obj.getBalance());
    }
    public static void withdrawal () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your withdrawal: ");
        obj.setBalance (bankAccount.withdraw(scanner.nextDouble(), obj.getBalance()));
    }
    public static void deposit () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your deposit: ");
        obj.setBalance (bankAccount.deposit(scanner.nextDouble(), obj.getBalance()));
    }
}
