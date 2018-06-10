package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.ExecutionContext;

public class BasePage {

    protected WebDriver driver;


     public BasePage() {
         driver = ExecutionContext.getInstance().getDriver();
    }

    public void clickButtonByCSS(String fieldCss) {
        WebElement clickButton = driver.findElement(By.cssSelector(fieldCss));
        clickButton.click();
    }

    public void clickButtonById(String id) {
        WebElement clickButton = driver.findElement(By.id(id));
        clickButton.click();
    }

    public void enterText(String id, String text) {
        WebElement textField = driver.findElement(By.id(id));
        textField.clear();
        textField.sendKeys(text);
    }

    public void clickSaveAndContinue() {
        WebElement saveButton = driver.findElement(By.id("submit"));
        saveButton.click();
    }
//
//    public void waitForElementPresent(By by) {
//        // Timeout in 30 seconds
//        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//    }
}
