package class5;


import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=scan.nextInt();
        if(age<18){
            System.out.println("you can't drive");
        }else {
            System.out.println("You can drive");
        }

    }
}
