package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "My Account")
    WebElement myAccount;

    @FindBy(linkText = "Login")
    WebElement login;

    @FindBy(name = "search")
    WebElement searchBox;

    @FindBy(css = "button.btn.btn-default.btn-lg")
    WebElement searchButton;

    public void clickMyAccount() {
        myAccount.click();
    }

    public void clickLogin() {
        login.click();
    }

    public void searchProduct(String product) {
        searchBox.clear();
        searchBox.sendKeys(product);
        searchButton.click();
    }
}