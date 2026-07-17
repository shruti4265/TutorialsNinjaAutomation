package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(linkText = "iPhone")
    WebElement iphone;

    @FindBy(id = "button-cart")
    WebElement addToCart;

    public void openProduct() {

        iphone.click();

    }

    public void addProductToCart() {

        addToCart.click();

    }

}