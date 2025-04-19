package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");
        System.out.println("Please enter two numbers to perform calculations.");
        System.out.println("Enter the first number:");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter the operation you want to achieve");
        System.out.println("1. Addition. \n 2. Subtraction \n 3. Multiplication \n 4. Division");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 : double sum = firstNumber + secondNumber;
                System.out.println("The addition of "+firstNumber+" and "+secondNumber+" were: " +sum);
                break;
            case 2 : double sub = firstNumber - secondNumber ;
                System.out.println("The subtraction of " +firstNumber+ " and "+secondNumber+" is: " +sub);
                break;
            case 3: double mul = firstNumber * secondNumber;
                System.out.println("The multiplication of the "+firstNumber+" and "+secondNumber+" is: " +mul);
                break;
            case 4: double div  = firstNumber/secondNumber;
                System.out.println("The division of "+firstNumber+ " and " +secondNumber+ " is: " +div);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
