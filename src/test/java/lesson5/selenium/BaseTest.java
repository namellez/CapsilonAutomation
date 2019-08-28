package lesson5.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static lesson5.selenium.GlobalSettings.DRIVER_PATH;

public class BaseTest {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver",DRIVER_PATH);
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void afterSuite() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
