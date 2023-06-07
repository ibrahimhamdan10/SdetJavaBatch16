package class28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int s = scan.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("InputMismatchException error");
        }
    }
}
