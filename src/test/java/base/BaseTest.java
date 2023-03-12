package base;

import core.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setup(){
        DriverManager.initDriver();

    }

    @AfterMethod(alwaysRun = true)
    public void close(){
        DriverManager.quitDriver();
    }
}
