package javaHandel;

import java.io.FileInputStream;
import java.io.IOException;

public class inputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\ibrah\\IdeaProjects\\SDETjavaBatch16\\Files\\file.txt");

             int data;
         while ((data=fis.read())!=-1){
             System.out.println((char) data);
         }
         fis.close();


        System.out.println("_______");

        byte [] b = new byte[3];
        fis.read(b);
        String s = new String(b);
        System.out.println(s);
        fis.close();




    }
}
