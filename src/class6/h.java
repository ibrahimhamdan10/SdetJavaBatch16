package class6;

import java.util.Scanner;

public class h {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scan.next();
        System.out.println("Enter your mobile number");
        String number= scan.next();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+number);


    }
}
