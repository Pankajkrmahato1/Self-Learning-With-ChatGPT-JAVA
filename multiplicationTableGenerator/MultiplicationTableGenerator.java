package multiplicationTableGenerator;

import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void main (String[] args){
        System.out.println("Welcome to Multiplication Table Generator");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want the multiplication table of: ");
        int number = scanner.nextInt();
        System.out.println("Enter the limit of the multiplication table");
        int limit = scanner.nextInt();

        for ( int i = 1 ; i <= limit ; i++)
            System.out.println(number+ " x " +i+ " = " +number*i);
    }
}
