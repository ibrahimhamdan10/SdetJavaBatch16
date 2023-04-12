package training;

import java.util.Scanner;

public class REPILT42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter the roll number of the Child");
        int rollNumber= scan.nextInt();

        switch (rollNumber){

            case 101:
                System.out.println("Student name: Ramesh");
                break;

            case 102:
                System.out.println("Student name: Mahesh");

            case 103:
                System.out.println("Student name: Mukesh");
                break;

            default:
                System.out.println("Not found Student name: in Class");


        }
    }
}
