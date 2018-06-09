package runners;

import config.ConfigDataLoader;
import org.junit.Before;
import org.junit.BeforeClass;
import util.ExecutionContext;

public abstract class BaseTestRunner {
  //  public WebDriver driver;
  //  static String webBrowser;

    @BeforeClass
    public  static void baseTestSetup()  {
        // Logger LOGGER = LoggerFactory.getLogger(DCJJourneyTest.class);
        ExecutionContext.getInstance().setConfigData(ConfigDataLoader.loadData());
        ConfigDataLoader.loadData();
//        webBrowser = ConfigData.configDataProperties.getProperty("WebBrowser");

    }

    @Before
    public void testSetup2()  {
        //  ConfigDataLoader.loadData();
//        switch (webBrowser){
//            case "Firefox":
//                //  System.setProperty(GECKO_DRIVER_EXE_PROPERTY, "C:\\Users\\mhakimov\\Downloads\\geckodriver.exe");
//                driver = new FirefoxDriver();
//                break;
//            case "Chrome":
//                driver = new ChromeDriver();
//                break;
//        }
    }

//    @After
//    public void close() {
//        driver.quit();
//    }


}
