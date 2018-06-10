package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigData {
    public static Properties configDataProperties;


    public void loadData(String dataFile) {

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(dataFile);
        configDataProperties = new Properties();
        try {
            configDataProperties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public final String getProperty(String key, String... subkeys) {
//        return configData
//                .getProperty(StringUtils.concatWith(KEYWORD_HIERARCHY_SEPARATOR, key, subkeys));
//    }
}
