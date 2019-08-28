package lesson5.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static lesson5.selenium.GlobalSettings.START_URL;

public class StartPage extends BasePage {

    @FindBy(xpath=".//div[@class='pzz-header-inner']")
    private WebElement header;

    @FindBy(xpath=".//button[@class='in-cart ']")
    private WebElement pizzaBtn;

    @FindBy(xpath=".//div[@class='pzz-cart__delivery pizza-sending']/a")
    WebElement deliveryBtn;

    @FindBy(xpath="//div[@class='pzz-navigation']//a[@href='/cart']")
    private WebElement cartBtn;

    @FindBy(xpath=".//a[@href='#pickup']")
    private WebElement pickupLbl;

    @FindBy(xpath="//div[@id='pickup']/form/div/p/button")
    private WebElement pickupLocationsLbl;

    @FindBy(xpath="//span[@class='filters__open']")
    private WebElement filtersLbl;


    public StartPage(WebDriver driver) {
        super(driver);
    }

    public StartPage open(){
        driver.get(START_URL);
        waitForElementToAppear(pizzaBtn);
        return this;
    }

    public StartPage selectPizza() throws InterruptedException {
        waitForElementToBeClickable(pizzaBtn);
        pizzaBtn.click();
        System.out.println("Selected a pizza");
        return this;
    }

    public StartPage selectSelfPickup(){
        waitForElementToBeClickable(pickupLbl);
        pickupLbl.click();
        System.out.println("Selected self-pickup");
        return this;
    }

    public StartPage selectPickupLocation(){
        waitForElementToBeClickable(pickupLocationsLbl);
        pickupLocationsLbl.click();
        waitForElementToDisappear(pickupLbl);
        System.out.println("Selected pickup location");
        return this;
    }

    public CartPage clickCartButton(){
        waitForElementToAppear(cartBtn);
        cartBtn.click();
        System.out.println("Clicked cart button");
        return new CartPage(driver);
    }


}




