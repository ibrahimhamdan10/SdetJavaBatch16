package class5;

import java.util.Scanner;

public class E4nestedIf {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        //if we dont want to use scanner
        // int money =2000;
        //  String day= "sunday";

        System.out.println("enter money");
        int money =scan.nextInt();

        System.out.println("enter day");
        String day=scan.next();

        if(money>1000) {
            if (day.equals("sunday"))
            {
                System.out.println("lets go shopping");
            }
            else
            {
                System.out.println("lets wait for sunday");
            }
        }
        else System.out.println("lets save more");

    }

    }

