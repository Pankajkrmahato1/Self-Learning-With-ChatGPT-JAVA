package gradeCalculator;

import java.util.Scanner;

public class GradeCalculator {
    public static void main (String[] args){
        System.out.println("Welcome to the Grade Calculator");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = scanner.nextInt();
        if(score> -1 && score <101){
            if (score >= 90) {
                System.out.println("Congrats! YOU GOT A");
            } else if (score >= 80) {
                System.out.println("Great! YOU GOT B");
            } else if (score > 69) {
                System.out.println("OK! YOU GOT C");
            } else if (score > 59) {
                System.out.println("CLOSE! You GOT a D");
            } else if (score <=  58) {
                System.out.println("SORRY! You GOT F");
            }
        }
        else
            System.out.println("INVALID");
    }
}
