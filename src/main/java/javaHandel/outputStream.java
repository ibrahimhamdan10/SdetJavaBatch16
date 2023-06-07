package javaHandel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class outputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\ibrah\\IdeaProjects\\SDETjavaBatch16\\Files\\file.txt");
        fos.write("مرحيا".getBytes());
        fos.flush();
    }
}
