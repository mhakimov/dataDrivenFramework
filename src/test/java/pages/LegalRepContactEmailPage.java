package pages;

import org.openqa.selenium.WebDriver;

public class LegalRepContactEmailPage {

    WebDriver driver;
    BasePage element;

    public LegalRepContactEmailPage(WebDriver driver) {
        this.driver = driver;
        element = new BasePage(driver);
    }

    public void navigateToNextPage(String ifHasLegalRep) {
        element.clickButtonById("hasLegalRep_" + ifHasLegalRep.toLowerCase());
        element.clickButtonById("submit");
    }
}
