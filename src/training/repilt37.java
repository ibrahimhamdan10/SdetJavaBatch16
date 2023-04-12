package training;

import java.util.Scanner;

public class repilt37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("are you thirsty ?");
       boolean boolean1= scan.nextBoolean();
        System.out.println("are you sleepy ?");
        boolean boolean2= scan.nextBoolean();
        String drink="";
        if(boolean1&&!boolean2){
         drink="water";
        } else if (boolean1&&boolean2) {
          drink="coffee";
        }
        else if (!boolean1&&boolean2) {
            drink="tea";
        }else drink="nothing";

        System.out.println("Looks like you need to drink "+drink);
    }
}
