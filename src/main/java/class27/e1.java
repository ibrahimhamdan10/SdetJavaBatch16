package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class e1 {
    public static Properties getProperties(String path) {
        FileInputStream fileInputStream = null;
        Properties properties = null;
        try {
            fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);

        } catch (IOException e) {
            System.out.println("Please check the file at the path if it is available " + path);
        }finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // 11:52
        return properties;
    }
}
