package lesson5.selenium;
import lesson5.selenium.pages.CartPage;
import lesson5.selenium.pages.StartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class OrderPizzaTest extends BaseTest {

    @Test(description = "[Log into pzz.by and order a pizza]")
    public void orderPizza() throws InterruptedException {

    StartPage startPage = new StartPage(getDriver());

    startPage.open()
        .selectPizza()
        .selectSelfPickup()
        .selectPickupLocation()
        .clickCartButton()
        .goToOrderDetails()
        .setPaymentMethod()
        .setDeliveryTime()
        .setName("Stepan")
        .setPhoneNumber(123456)
        .setHouseNumber(25);
        }

}
