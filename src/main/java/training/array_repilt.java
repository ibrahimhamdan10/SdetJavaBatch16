package training;

import java.util.Scanner;

public class array_repilt {
    public static void main(String[] args) {
        /*
        int [] numbers={45,78,12,67,55};

        for (int counter = 0; counter <numbers.length ; counter++) {
            System.out.print(numbers[counter]+" ");
        }

         */
        /*

        int [] numbers={45,78,12,67,55,89,23,77,88};
        for (int counter = 0; counter < numbers.length; counter+=2) {
            System.out.print(numbers[counter]+" ");
        }

         */
        /*
        char [] myChar={'s', 'y',  'b', 'n', 'c', 't' ,  'd','a', 'e', 'x'};
        String syntax="";
        for (int counter = 0; counter <myChar.length ; counter++) {
            if(myChar[counter]=='s'||myChar[counter]=='y'||myChar[counter]=='n'||myChar[counter]=='t'||myChar[counter]=='a'||myChar[counter]=='x'){
                syntax+=myChar[counter];
            }
        }
        System.out.println(syntax);

         */
        /*
        int [] array=new int [11];
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2010 + counter;
        }
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
        */
        /*
          String[] array = new String[7];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week");
            array[i] = scan.nextLine();

        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
         */
/*
      Scanner scan = new Scanner(System.in);

        int[]array=new int[5];
        for (int i = 0; i <array.length ; i++) {
            array[i]=scan.nextInt();

        }
        for (int j = array.length-1; j >=0 ; j--) {
            System.out.println(array[j]);
        }

 */
        /*
            Scanner input = new Scanner(System.in);
            int [] array=new int [5];
        for (int i = 0; i <array.length ; i++) {
          array[i]=input.nextInt();

        }

        for (int j = 0; j <array.length ; j++) {
            System.out.println(array[j]*10);
        }

         */
    }
}
