package class4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("pls enter your salary");
        int salary=scan.nextInt();

        if(salary>100)

        {
            System.out.println("rich");
        }
        else
        {
            System.out.println("look for better job");
        }

    }

}
