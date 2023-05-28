package training;

import java.util.Scanner;

public class repilt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you need a loan");
        boolean loan = scan.nextBoolean();
        String eligibility = "Unknown";
        if (loan) {
            System.out.println("What is your credit score");
            int score = scan.nextInt();

                    if (score < 600) {
                        eligibility="not eligible";
                    } else if (score >= 600 && score <= 700) {
                        eligibility="maybe";
                    } else if (score >= 701 && score <= 800) {
                        eligibility="eligible ";
                    } else if (score > 800) {
                        eligibility="Definitely eligible ";
                    }

        }
        else eligibility="unKnow";

        System.out.println("The eligibility is "+eligibility);
    }
}