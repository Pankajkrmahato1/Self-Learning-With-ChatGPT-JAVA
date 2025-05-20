package in28minutes.codingExercises;

import java.util.Scanner;

public class SumOfSquares {
    public static void main (String[] args){
        System.out.println("Welcome to print the sum of squares");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n till which you \n" +
                "want to print the sum of the squares");
        int limit = scanner.nextInt();
        System.out.println("Sum of squares till " +limit+ " \n" +
                "is " +sumOfSquares(limit));
    }
    public static long sumOfSquares(int limit){
        long sum = 0;
        for(int i = 1 ; i <= limit; i++)
            sum = sum + (i*i);
        return sum;
    }
}
