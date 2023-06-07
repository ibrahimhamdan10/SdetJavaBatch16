package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
    public static Properties getProperties (String path) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties;
    }

    public static String getProperty(String key) throws IOException {

        Properties properties = getProperties(constants.ConfigReaderPath);
        String value =properties.getProperty(key);
        return value;
    }

}
