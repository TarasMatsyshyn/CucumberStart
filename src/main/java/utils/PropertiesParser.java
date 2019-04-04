package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesParser {

    private static Properties getPropertyInstance(String properyFilePath) {

        FileInputStream inputStream;
        Properties instance = new Properties();

        try {
            inputStream = new FileInputStream(properyFilePath);
            instance.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public String getBaseUrl(String propertyFilePath) {
        return getPropertyInstance(propertyFilePath).getProperty("base.url");
    }

}
