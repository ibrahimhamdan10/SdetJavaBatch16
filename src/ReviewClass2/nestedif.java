package ReviewClass2;

import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("do you take the vaccine true or false");
        boolean vaccine= scan.nextBoolean();
        System.out.println("HOW MANY SHOT YA MANYAK");
        int does= scan.nextInt();

      //  boolean vaccine=false;
       // int does=0;

        if(vaccine) {

                    if (does == 1) {
                        System.out.println("منيك");
                    } else if (does == 2) {
                        System.out.println("منيكككككككك");
                    } else if (does == 3) {
                        System.out.println("منيككككككككككككككك");
                    } else {
                        System.out.println("good");
                    }
                  }
        else
        {
            System.out.println("zalmehhhhhhhh");
        }


        }
    }

