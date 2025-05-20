package in28minutes.codingExercises;

import java.util.Scanner;
public class TimeConvertor {
    private static int hours;
    private static int days;
    public static void main(String[] args){
        System.out.println("Enter the choice \n" +
                "1. To convert hours to minutes\n" +
                "2.To convert Days to minutes");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1 :
                System.out.println("Enter the hours");
                hours = scanner.nextInt();
                System.out.println(hours+ " in minutes " +convertHoursToMinutes(hours));
                break;
            case 2 :
                System.out.println("Enter the days");
                days = scanner.nextInt();
                System.out.println(days + " in minutes " +convertDaysToMinutes(days));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    public static int convertHoursToMinutes(int hours){
        return 60*hours;
    }
    public static int convertDaysToMinutes(int days){
        return days*(24*60);

    }
}
