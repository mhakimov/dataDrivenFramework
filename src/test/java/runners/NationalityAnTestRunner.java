package runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(NationalityAnData.class)
public class NationalityAnTestRunner extends BaseTestRunner {

    @BeforeClass
    public static void testSetup()  {


    }

//    @Test
//    public void testSetup2()  {
//
//        driver.get(ConfigData.configDataProperties.getProperty("Host") + "nationality-an");
//
//    }

}
