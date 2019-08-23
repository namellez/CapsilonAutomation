package lesson5.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath=".//input[@name='name']")
    WebElement nameField;

    @FindBy(xpath=".//input[@name='phoneNumber']")
    WebElement phoneField;

    @FindBy(xpath=".//div[@class='pzz-cart__delivery pizza-sending']/a")
    WebElement houseDropdown;

    @FindBy(xpath="//div[contains(@class, 'payment-cash-button')]")
    WebElement paymentSelector;

    @FindBy(xpath="//div[contains(@class, 'self-delivery-35-button')]")
    WebElement timeSelector;

    public CartPage inputOrderDetails() throws InterruptedException {
        waitForElementToAppear(paymentSelector);
        paymentSelector.click();
        System.out.println("123");

        waitForElementToAppear(timeSelector);
        timeSelector.click();
        System.out.println("234234");

        waitForElementToAppear(nameField);
        nameField.sendKeys("Stepan");
        System.out.println("234234");

        waitForElementToAppear(phoneField);
        phoneField.sendKeys("666666");
        System.out.println("234234");

        new Select(houseDropdown).selectByVisibleText("25 ");

        return this;
    }

}
