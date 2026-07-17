package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

    WebDriver driver;

    public AccountPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver,this);

    }

    @FindBy(linkText="Logout")
    WebElement logout;

    @FindBy(name="search")
    WebElement searchBox;

    @FindBy(css="button.btn.btn-default.btn-lg")
    WebElement searchButton;

    public boolean isAccountPageDisplayed() {

        return driver.getTitle().contains("My Account");

    }

    public void searchProduct(String product) {

        searchBox.sendKeys(product);

        searchButton.click();

    }

    public void logout() {

        logout.click();

    }
    

}