package training;

import java.util.Scanner;

public class replit46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number between 1-7");
        int numbers= scan.nextInt();
        switch (numbers){

                case 1:
                System.out.println("Sunday");
                break;
                case 2:
                System.out.println("Monday");
                break;
                case 3:
                System.out.println("Tuesday");
                break;
                case 4:
                System.out.println("Wednesday");
                break;
                case 5:
                System.out.println("Thursday");
                break;
                case 6:
                System.out.println("Friday");
                break;
                case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid");


        }
    }
}
