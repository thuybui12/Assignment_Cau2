package pages;

import core.Constants;
import core.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;


    public BasePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIME_OUT));
    }

    public void clickToElement(WebElement element) {
        element.click();
    }

    public void sendKeysToElement(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public String getTextElement(WebElement element) {
        return element.getText();
    }

    public String getAttribute(WebElement element, String attributeVale) {
        return element.getAttribute(attributeVale);
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public WebElement waitForElementVisible(WebElement element) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIME_OUT));
        try {
            element = wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            System.err.println(" Element not visible");
        }
        return element;
    }

}
