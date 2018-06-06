package pages;

import config.ConfigData;
import data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

    protected WebDriver driver;
    static String webBrowser;
    TestData testData;
   // public WebElements (WebDriver driver) {
//        this.driver = driver;
//    }


     public BasePage() {
         webBrowser = ConfigData.configDataProperties.getProperty("WebBrowser");

         switch (webBrowser){
             case "Firefox":
                 //  System.setProperty(GECKO_DRIVER_EXE_PROPERTY, "C:\\Users\\mhakimov\\Downloads\\geckodriver.exe");
                 driver = new FirefoxDriver();
                 break;
             default:
                 driver = new ChromeDriver();
                 break;
         }

         driver.get(ConfigData.configDataProperties.getProperty("Host") + testData.productName);
         this.driver = driver;
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
