package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {

    WebDriver driver;

    public Methods(WebDriver driver) {
        this.driver = driver;
    }

    public void SelectRadioById(String id){
        By by = By.id(id);
        waitForElementPresent(by);
        boolean isDisplayed = isDisplayed(by);
        boolean isEnabled = isEnabled(by);
        boolean isClicked = false;
        if (isDisplayed && isEnabled) {
            driver.findElement(by).click();
            isClicked = true;
        } else {
            throw new RuntimeException("web element was not found! Clicked status: " + isClicked);
        }

    }

    public void ClickAt(WebElement element)
    {
//        ScrollIntoView(element);
//        ExplicitWait(element, 10000);
//        element.Click();
    }

//    public void click(PageElement element) {
//        driver.findElement(element.getBy()).click();
//    }

    public void waitForElementPresent(By by) {
        // Timeout in 30 seconds
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

      //  wait.until(ExpectedConditions.visibilityOfElementLocated(element.getBy()));
    }

    public boolean isDisplayed(By by) {
        return driver.findElement(by).isDisplayed();
    }

    public boolean isEnabled(By by) {
        return driver.findElement(by).isEnabled();
    }
}
