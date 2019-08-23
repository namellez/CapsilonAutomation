package lesson5.selenium;
import lesson5.selenium.pages.CartPage;
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
    startPage.open();

        Thread.sleep(1000);
        startPage.selectPizza();

        Thread.sleep(1000);
        startPage.setDeliveryAddress();
        Thread.sleep(3000);

        CartPage cartPage = startPage.goToCart();
            Thread.sleep(3000);

            cartPage.inputOrderDetails();
        Thread.sleep(3000);


        }









}
