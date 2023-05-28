package ProjectHW;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter num");
        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();
        boolean isPrime=true;
        for (int i = 2; i <num/2 ; i++) {
            if(num%i==0){
                isPrime=true;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        }
    }

