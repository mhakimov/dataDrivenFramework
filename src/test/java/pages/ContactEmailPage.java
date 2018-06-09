package pages;

import org.openqa.selenium.WebDriver;

public class ContactEmailPage {

    WebDriver driver;
    BasePage element;

    public ContactEmailPage() {
        this.driver = driver;
        element = new BasePage();
    }

    public void fillInEmailDetails() {
        element.enterText("email","admin@wagamama.com");
        element.enterText("password1", "qwerty7");
        element.enterText("password2", "qwerty7");
        element.clickSaveAndContinue();
    }
}
