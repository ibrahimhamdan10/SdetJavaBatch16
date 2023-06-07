package review27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class e1 {
    public static void main(String[] args) throws IOException {
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        System.out.println((char) fis.read());
        System.out.println((char) fis.read());





    }
}
