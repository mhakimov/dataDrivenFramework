package pages;

import config.ConfigData;
import data.TestData;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    WebDriver driver;
    static String webBrowser = ConfigData.configDataProperties.getProperty("WebBrowser");
    protected TestData testData;
    String visaType;

    @Before
    public void start() {

        switch (webBrowser){
            case "Firefox":
                //  System.setProperty(GECKO_DRIVER_EXE_PROPERTY, "C:\\Users\\mhakimov\\Downloads\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }

        driver.get(ConfigData.configDataProperties.getProperty("Host") + testData.productName);

    }

    public BaseTest() {
       // webBrowser = ConfigData.configDataProperties.getProperty("WebBrowser");

//        switch (webBrowser){
//            case "Firefox":
//                //  System.setProperty(GECKO_DRIVER_EXE_PROPERTY, "C:\\Users\\mhakimov\\Downloads\\geckodriver.exe");
//                driver = new FirefoxDriver();
//                break;
//            default:
//                driver = new ChromeDriver();
//                break;
//        }

       // driver.get(ConfigData.configDataProperties.getProperty("Host") + testData.productName);

        testData = new TestData();
        testData.productName = visaType;
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
