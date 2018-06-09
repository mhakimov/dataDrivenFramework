package pages;

import org.openqa.selenium.WebDriver;

public class StartPage {

    WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToStartPage() {
        new BasePage().clickButtonByCSS("a[data-track='apply-now']");
    }
}
