package lesson5.selenium.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath=".//input[@name='name']")
    private WebElement nameField;

    @FindBy(xpath=".//input[@name='phoneNumber']")
    private WebElement phoneField;

    @FindBy(xpath=".//div[@class='pzz-cart__delivery pizza-sending']/a")
    private WebElement houseDropdown;

    @FindBy(xpath="//div[@class = 'ips__group payment-cash-button']")
    private WebElement paymentSelector;

    @FindBy(xpath="//div[contains(@class, 'self-delivery-35-button')]")
    private WebElement timeSelector;

    @FindBy(xpath="//input[@id='s2id_autogen4_search']")
    private WebElement houseSearchBox;

    @FindBy(xpath="//div[@id='s2id_home-number']//span[@class='select2-arrow']")
    private WebElement houseDropdownArrow;

    @FindBy(xpath="//span[@class='btn-next show-address-form']")
    private WebElement orderDetailsBtn;


    public CartPage goToOrderDetails() {
        waitForElementToAppear(orderDetailsBtn);
        orderDetailsBtn.click();
        System.out.println("Went to order details");
        return this;
    }

    public CartPage setPaymentMethod() {
        waitForElementToAppear(paymentSelector);
        paymentSelector.click();
        System.out.println("Set payment method");
        return this;
    }

    public CartPage setDeliveryTime() {
        waitForElementToAppear(timeSelector);
        timeSelector.click();
        System.out.println("Set delivery time");
        return this;
    }

    public CartPage setName(String name) {
        waitForElementToAppear(nameField);
        nameField.sendKeys(name);
        System.out.println("Filled in name");
        return this;
    }

    public CartPage setPhoneNumber(int number) {
        waitForElementToAppear(phoneField);
        phoneField.sendKeys(Integer.toString(number));
        System.out.println("Filled in phone number");
        return this;
    }

    public CartPage setHouseNumber(int number) {
        houseDropdownArrow.click();
        waitForElementToAppear(houseSearchBox);
        houseSearchBox.sendKeys(Integer.toString(number));
        houseSearchBox.sendKeys(Keys.RETURN);
        System.out.println("Selected house number");
        return this;
    }

}
