package ScalerAssignments;

import java.util.Scanner;

public class RefersherWhileLoopDay7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter test cases");
        int testCases = scanner.nextInt();
        int counter= 0;
        while (testCases!=0){
            int number = scanner.nextInt();
            while (number>0){
                 counter++;
                number = number % 10;
                if (number == 0) {
                    System.out.println(counter);
                    counter = 0;
                }
            }

            testCases--;
        }
    }
}
