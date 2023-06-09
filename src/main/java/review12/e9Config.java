package review12;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class e9Config {
    public static void main(String[] args) {

        String path = "files2/config.prperties";
        FileInputStream fis=null ;
        String value =null;
        try {
             fis = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(fis);
            properties.getProperty("url");

        }catch (IOException f){
            f.printStackTrace();
        }
        finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
