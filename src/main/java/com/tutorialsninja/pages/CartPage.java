package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(linkText = "Shopping Cart")
    WebElement shoppingCart;

    public void openCart() {

        shoppingCart.click();

    }

    public boolean verifyCartPage() {

        return driver.getTitle().contains("Shopping Cart");

    }

}