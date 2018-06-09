package util;

import config.ConfigData;
import data.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecutionContext {

    private static ExecutionContext executionContext;
    private WebDriver driver;
    private ConfigData configData;
    private TestData testData;

    public static ExecutionContext getInstance() {
        if (executionContext == null) {
            executionContext = new ExecutionContext();
        }
        return executionContext;
    }

    public void setConfigData(ConfigData configData) {
        this.configData = configData;
    }

    public ConfigData getConfigData() {
        if (configData == null) {
            configData = new ConfigData();
        }
        return configData;
    }

    public void setTestData(TestData testData) {
        this.testData = testData;
    }

    public void setDriver() {
        String webBrowser = ConfigData.configDataProperties.getProperty("WebBrowser");
        switch (webBrowser){
            case "Firefox":
                //  System.setProperty(GECKO_DRIVER_EXE_PROPERTY, "C:\\Users\\mhakimov\\Downloads\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
    }

    public WebDriver getDriver(){
        return driver;
    }
}
