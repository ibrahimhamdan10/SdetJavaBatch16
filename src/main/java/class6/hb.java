package class6;

import java.util.Scanner;

public class hb {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("enter your high inches");
        int inches = scan.nextInt();

        if(inches<60)
        {
            System.out.println("short");
        }
        else if (inches>=60&&inches<=72)
        {
            System.out.println("medium");
        }
        else
        {
            System.out.printf("tallllllllllll");
        }

    }
}
