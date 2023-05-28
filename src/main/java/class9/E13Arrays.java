package class9;

import java.util.Scanner;

public class E13Arrays {
    public static void main(String[] args) {
        int [] numbers=new int[3];
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please Enter int numbers");
            numbers[i]=scan.nextInt();
        }
        for (int j = 0; j <numbers.length ; j++) {
            System.out.println(numbers[j]);
        }


        }
    }