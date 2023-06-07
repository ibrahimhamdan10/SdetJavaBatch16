package javaHandel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\ibrah\\IdeaProjects\\SDETjavaBatch16\\Files\\read.txt");
        try {
            FileReader reader = new FileReader(file);
            int date;
            while ((date=reader.read())!=-1){
                System.out.print((char) date);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
