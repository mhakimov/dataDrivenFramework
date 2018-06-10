package runners;

import config.ConfigDataLoader;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class BaseTestRunner {
  //  public WebDriver driver;
  //  static String webBrowser;

    @BeforeClass
    public  static void baseTestSetup()  {
        // Logger LOGGER = LoggerFactory.getLogger(DCJJourneyTest.class);
 //       ExecutionContext.getInstance().setConfigData(ConfigDataLoader.loadData());
        ConfigDataLoader.loadData();
//        webBrowser = ConfigData.configDataProperties.getProperty("WebBrowser");

    }

    @Before
    public void testSetup2()  {}


}
