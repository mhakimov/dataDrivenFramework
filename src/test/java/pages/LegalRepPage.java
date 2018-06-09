package pages;

import org.openqa.selenium.WebDriver;

public class LegalRepPage {

    WebDriver driver;
    BasePage element;

    public LegalRepPage(WebDriver driver) {
        this.driver = driver;
        element = new BasePage();
    }

    public void navigateToNextPage(String ifHasLegalRep) {
        element.clickButtonById("hasLegalRep_" + ifHasLegalRep.toLowerCase());
        element.clickButtonById("submit");
    }
}
