package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import base.BaseTest;

public class DemoTest extends BaseTest {
    HomePage homePage;


    @Test
    public void TC_01() {
        homePage = new HomePage();
        homePage = new HomePage();
        homePage.inputEmailName("admin@phptravels.com");
        homePage.inputPasswordValue("demoadmin");
        homePage.checkOnRememberMeBox();
        homePage.clickOnLoginbutton();
        homePage.verrifyDefaultScreenIsDisplay();
    }
    @Test
    public void TC_02() {
        homePage = new HomePage();
        homePage.inputEmailName("admin@phptravels.com");
        homePage.inputPasswordValue("1234433");
        homePage.checkOnRememberMeBox();
        homePage.verrifyButtonIsClickable("class");
    }
}
