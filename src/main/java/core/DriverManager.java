package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver() {
        setDriver(new ChromeDriver());
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.TIME_OUT));
        getDriver().manage().window().maximize();
        getDriver().get("https://phptravels.net/api/admin");
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver setDriver) {
        driver.set(setDriver);
    }

    public static void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}
