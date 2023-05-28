package class4;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = scanner.next();

        if (name.equals("ibrahim"))
        {
            System.out.println("mac user");
        }

        else if (name.equals("mohammed"))
        {
            System.out.println("window user");
        }
        else if (name.equals("ghada"))
        {
            System.out.println("habibte");
        }


    }
}
