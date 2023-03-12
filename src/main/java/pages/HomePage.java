package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[text()='Email']/preceding-sibling::input")
    WebElement EMAIL_LOCATOR;
    @FindBy(xpath = "//*[text()='Password']/preceding-sibling::input")
    WebElement PASSWORD_LOCATOR;
    @FindBy(xpath = "//*[text()=' Remember me ']//ins")
    WebElement REMEMBER_ME_CHECK_BOX;
    @FindBy(xpath = "//*[text()=' Remember me ']//div")
    WebElement REMEMBER_ME_STATUS;
    @FindBy(xpath = "//*[text()='Login']/ancestor::button")
    WebElement LOGIN_BUTTON;
    @FindBy(xpath = "//main//*[text()='Dashboard']")
    WebElement DASHBOARD;

    public void inputEmailName(String email){
        sendKeysToElement(EMAIL_LOCATOR, email);
    }
    public void inputPasswordValue(String password){
        sendKeysToElement(PASSWORD_LOCATOR, password);
    }
    public void checkOnRememberMeBox(){
        clickToElement(REMEMBER_ME_CHECK_BOX);
    }
    public void verrifyButtonIsClickable(String attributeName){
        Assert.assertTrue(getAttribute(REMEMBER_ME_STATUS, attributeName).equals("icheckbox_square-grey hover checked"));
    }
    public void clickOnLoginbutton(){
        clickToElement(LOGIN_BUTTON);
    }
    public void verrifyDefaultScreenIsDisplay(){
        try {
        if(DASHBOARD.isDisplayed()) {

            waitForElementVisible(DASHBOARD);
            Assert.assertTrue(isElementDisplayed(DASHBOARD));
            System.out.println("PASS");
        }
            }catch(Exception e){
                System.out.println("FAILED");
            }
        }

    }



