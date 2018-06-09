package pages;

import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

   // WebDriver driver;

    public HomePage() {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public LegalRepPage navigateToLegalRepPage() {
        new BasePage().clickButtonByCSS("a[data-track='apply-now']");
        return new LegalRepPage(driver);
    }
}
