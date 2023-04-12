package training;

import java.util.Scanner;

public class replit39 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your marks");
        int marks =scan.nextInt();

        String grade="";

         if(marks>=1&&marks<=25) {
         grade = ("F");
        }else if (marks < 1 || marks > 100) {
         System.out.println("Please enter valid mark.");
         } else if (marks <= 25) {
        } else if (marks>=25&&marks<=45) {
        grade=("E");
        } else if (marks>=45&&marks<=50) {
          grade= ("D");
        } else if (marks>=50&&marks<=60) {
         grade= ("C");
        } else if (marks>=60&&marks<=80) {
           grade=("B");
        } else if (marks>80) {
         grade= ("A");
        }
        System.out.println("Your grade is "+grade);

    }
}
