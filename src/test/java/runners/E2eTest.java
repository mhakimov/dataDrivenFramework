package runners;

import config.ConfigData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.BaseTest;
import pages.ContactEmailPage;
import pages.HomePage;
import pages.LegalRepPage;

@RunWith(Parameterized.class)
public class E2eTest extends BaseTest {

    String visaType;
    String value;

    public E2eTest(String index, String testId) {
        super(index, testId);
        this.value = index;
    }




    @Before
    public void start() {

        testData.productName = visaType;
        driver.get(ConfigData.configDataProperties.getProperty("Host") + testData.productName);
    }


    @Test
    public void test() {
        String hasLegalRepValue = getTestDataValue(neededRowMap, "hasLegalRep");

        LegalRepPage legalRepPage = new HomePage().navigateToLegalRepPage();
        legalRepPage.navigateToNextPage(hasLegalRepValue);
        if (hasLegalRepValue.equalsIgnoreCase("true")) {

        }
        new ContactEmailPage().fillInEmailDetails();
    }

    @After
    public void close() {
 //       closeBrowser();
        System.out.println("browser is closed.. NOT");
    }

}
