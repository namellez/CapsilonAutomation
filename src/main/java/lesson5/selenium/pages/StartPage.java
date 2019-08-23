package lesson5.selenium.pages;

import lesson5.selenium.GlobalSettings;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static lesson5.selenium.GlobalSettings.START_URL;

public class StartPage extends BasePage {

    @FindBy(xpath=".//div[@class='pzz-header-inner']")
    WebElement header;

    @FindBy(xpath=".//button[@class='in-cart ']")
    WebElement pizzaBtn;

    @FindBy(xpath=".//div[@class='pzz-cart__delivery pizza-sending']/a")
    WebElement deliveryBtn;

    @FindBy(xpath="//a[@href='/cart']")
    WebElement cartBtn;

    @FindBy(xpath=".//a[@href='#pickup']")
    WebElement pickupLbl;

    @FindBy(xpath="//div[@id='pickup']/form/div/p/button")
    WebElement pickupLocationsLbl;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public StartPage open(){
        driver.get(START_URL);
        //waitForElementToAppear(header);
        return this;
    }

    public StartPage selectPizza() throws InterruptedException {
        waitForElementToAppear(pizzaBtn);
        pizzaBtn.click();
        System.out.println("Clicking on pizza name");
        return this;
    }

    public StartPage setDeliveryAddress(){
        waitForElementToAppear(pickupLbl);
        pickupLbl.click();
        System.out.println("Selecting self-pickup");

        waitForElementToAppear(pickupLocationsLbl);
        pickupLocationsLbl.click();
        System.out.println("Selecting first pickup location");
        return this;
    }

    public CartPage goToCart(){
        waitForElementToAppear(cartBtn);
        cartBtn.click();
        System.out.println("Clicking cart button");
        return new CartPage(driver);
    }



}




