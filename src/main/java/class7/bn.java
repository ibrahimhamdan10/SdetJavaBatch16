package class7;

import java.util.Scanner;

public class bn {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        int lastNumber = scan.nextInt();
        int counter=1;
        while (counter<=lastNumber){
            System.out.println(counter);
            counter++;
        }
    }
;
}
