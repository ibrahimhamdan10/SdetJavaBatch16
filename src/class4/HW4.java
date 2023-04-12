package class4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" enter your city");
        String city=scan.next();

        System.out.println("enter the temperature in F");
        int tempF=scan.nextInt();

       int tempC= (tempF-32)*5/9;
        System.out.printf("the temperatureC in "+city+" is "+tempC);



    }
}
