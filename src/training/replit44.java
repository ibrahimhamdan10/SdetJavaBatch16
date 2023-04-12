package training;

import java.util.Scanner;

public class replit44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carOrigin= scan.next();

        switch (carOrigin){
            case "BMW":
                carOrigin = "german car";
                break;
            case "Toyota":
               carOrigin = "japanese car";
               break;

            case "Maserati":
                carOrigin="italian car";
                break;

            default:carOrigin="unknown";

        }
        System.out.println("Your favorite car is "+carOrigin);

    }
}
