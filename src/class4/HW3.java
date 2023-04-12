package class4;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("whats your age");
        int age = scan.nextInt();

        if(age>=18)
        {
            System.out.println("thank you,i will issue you a driver license");
        }
        else
        {
            System.out.println("you can get a learners permit");
        }


    }
}
