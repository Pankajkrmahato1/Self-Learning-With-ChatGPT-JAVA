package evenOddChecker;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main (String[] args){
        System.out.println("Welcome to the Even Odd Checker");

        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number% 2 == 0)
            System.out.println("The number: "+number+" is even");
        else
            System.out.println("The number: "+number+" is odd");
    }
}
