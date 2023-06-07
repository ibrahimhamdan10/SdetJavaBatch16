package javaHandel;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
            try {
        File myFile = new File("C:\\Users\\ibrah\\OneDrive\\Desktop\\test.txt");


        if (myFile.createNewFile()) {
            System.out.println("file.txt is created ! " + myFile.getName());
        }
        else
             System.out.println("file.txt is already exists");
                System.out.println(myFile.getAbsolutePath());
                System.out.println(myFile.canWrite());
                System.out.println(myFile.canRead());
                System.out.println(myFile.length());
       }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

        System.out.println("________________");

        try {

            FileWriter fw = new FileWriter("test.txt");

            fw.write("Allah akbar ");
            fw.write("hello my name is ibrahim");
            fw.close();
            System.out.println("successfully wrote ");
        }catch (Exception e){
            System.out.println("error");
        }

        System.out.println("________________");

        try {
            File myFile = new File("test.txt");
            Scanner scan = new Scanner(myFile);
                while (scan.hasNext()){
                    String data= scan.nextLine();
                    System.out.println(data);
                }
        }catch (Exception e){
            System.out.println("error");
        }
    }
}
