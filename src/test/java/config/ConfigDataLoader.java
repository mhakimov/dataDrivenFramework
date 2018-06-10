package config;

public class ConfigDataLoader {


    public static void loadData() {

        String dataFile = "configuration.properties";
        new ConfigData().loadData(dataFile);

    }


}
