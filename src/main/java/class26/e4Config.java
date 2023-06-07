package class26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class e4Config {
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        String path =System.getProperty("user.dir")+"\\"+"Files\\config.properties";
        System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("userName"));

    }
}
