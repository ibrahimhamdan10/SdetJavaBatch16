package class6;

import java.util.Scanner;

public class gender {
    public static void main(String[] args) {

      //  Scanner scan=new Scanner(System.in);
       // char gender=scan.next().charAt(0);
        char gender='f';

        switch (gender){

            case 'f':
                System.out.println("female");
                break;

            case 'm':
                System.out.println("male");
                break;

            default:
                System.out.println("animal");

        }

    }
}
