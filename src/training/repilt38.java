package training;

import java.util.Scanner;

public class repilt38 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Is it weekend? ");
        boolean weekend=  scan.nextBoolean();
        String subject="";
        if (!weekend){
            subject="manual testing";
        } else if (weekend) {
            subject="Java";
        }
        System.out.println("Today you will be learning "+subject);
    }

}
/*
        System.out.println("Is it weekend? ");
        boolean weekend=  scan.nextBoolean();
        String subject="";
        if (!weekend){
            System.out.println("Today you will be learning manual testing");
        } else if (weekend) {
          System.out.println("Today you will be learning java);
        }
*/
