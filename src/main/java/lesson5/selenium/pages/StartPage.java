package lesson5.selenium.pages;

import lesson5.selenium.GlobalSettings;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static lesson5.selenium.GlobalSettings.START_URL;

public class StartPage extends BasePage {

    @FindBy(xpath="//input[@class='fast-search__input']")
    WebElement searchField;

    @FindBy(xpath="//div[@class='pzz-header-inner']")
    WebElement header;

    @FindBy(xpath="//a[contains (@class, 'Гавайская')]")
    WebElement pizzaTitle;

    @FindBy(xpath="//a[@class='class']")
    WebElement hea123der;



    public StartPage(WebDriver driver) {
        super(driver);
    }

    public StartPage open(){
        driver.get(START_URL);
        //waitForElementToAppear(header);
        return this;
    }

    public StartPage selectPizza(){
        waitForElementToAppear(pizzaTitle);
        pizzaTitle.click();
        return this;
    }

    public StartPage addPizzaToCart(){
        waitForElementToAppear(searchField);
        searchField.click();
        return this;
    }

    public StartPage closePopup(){
        waitForElementToAppear(searchField);
        searchField.click();
        return this;
    }
}




