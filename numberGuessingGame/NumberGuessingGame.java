package numberGuessingGame;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main (String[] args){
        int number = (int)(Math.random()*100);
        System.out.println("Welcome to number Guessing Game");
        System.out.println("Rules of this game: \n 1.You have to guess a 2 digit number from 0-99 \n 2. If your guess is 25 numbers " +
                "ahead or lower than the given number the message would be NOT CLOSE \n" +
                "3. If you are 15 ahead or lower than the number the message would be WARMER \n" +
                "4. If you are 10 ahead or lower than the number the message would be HOT \n" +
                "5. If you are 5 ahead or lower than the number the message would be RED HOT \n" +
                "6. YOU GET 5 Tries");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets Begin !");
        for (int i = 1 ; i < 6; i ++){
            int greater;
            int lower;
            System.out.println("Enter your "+i+ " try");
            int guess = scanner.nextInt();
            if(guess == number) {
                System.out.println("YOU WON!! IT TOOK YOU " + i + " NUMBER OF TRIES TO GET IT RIGHT! ");
                break;
            }
            else if(guess > number){
                greater = guess - number;
                if(greater >= 25)
                    System.out.println("NOT CLOSE");
                else if (greater <= 15 && greater > 10) {
                    System.out.println("WARMER");
                }
                else if (greater<=10 && greater > 5)
                    System.out.println("HOT");
                else if (greater <=5 ) {
                    System.out.println("RED HOT");
                }
            } else if (guess < number) {
                lower = number - guess;
                if(lower >= 25)
                    System.out.println("NOT CLOSE");
                else if (lower <= 15 && lower > 10) {
                    System.out.println("WARMER");
                }
                else if (lower<=10 && lower > 5)
                    System.out.println("HOT");
                else if (lower <=5 ) {
                    System.out.println("RED HOT");
                }
            }

            if (i == 5) {
                System.out.println("This was your last try! Sorry you failed! The number was: "+number);
            }
        }
        

    }
}
