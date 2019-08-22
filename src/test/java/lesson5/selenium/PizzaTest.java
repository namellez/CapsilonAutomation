package lesson5.selenium;
import lesson5.selenium.pages.StartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class PizzaTest extends BaseTest {

    @Test(description = "[Log into ...]()")
    public void login() throws InterruptedException {

    StartPage startPage = new StartPage(getDriver());
    startPage.open()
            .selectPizza();

        }









}
