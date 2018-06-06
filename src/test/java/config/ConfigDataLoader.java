package config;

import java.util.Properties;

public class ConfigDataLoader {

  //  List<String> DataFileList;
     Properties configDataProperties;

    public static void loadData() {

        String dataFile = "configuration.properties";
        new ConfigData().loadData(dataFile);

    }


}
