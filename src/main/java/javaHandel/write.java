package javaHandel;

import java.io.*;
import java.io.FileWriter;

public class write {
    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\ibrah\\IdeaProjects\\SDETjavaBatch16\\Files\\poem.txt");
            FileWriter write = new FileWriter(file);
            write.write("ibrahim love Allah");
            write.write("\n another line");
            write.close();
            }
         catch (IOException e) {
             System.out.println("error");
        }
    }
 }

