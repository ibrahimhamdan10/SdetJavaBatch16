package class4;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("what is your name habibi");
       String name= scan.next();
        System.out.println("nice to meet you "+name+" what is the amount of loan is needed");
        int loan = scan.nextInt();
        if(loan<=200000)
        {
            System.out.println("i will lend the money");
        }
        else
        {
            System.out.println("i will not lend the money");
        }


    }

}
