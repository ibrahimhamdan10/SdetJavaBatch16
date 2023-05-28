package repilt174;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of values to input: ");
        int count = scan.nextInt();
        System.out.println("Enter  numbers:");

        for (int i = 0; i < count; i++) {
            int num = scan.nextInt();
            list.add(num);
        }

        System.out.println("The numbers entered are:");
        for (int number : list) {
            System.out.println(number);
        }
    }
}