package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "search")
    WebElement searchBox;

    @FindBy(css = "button.btn.btn-default.btn-lg")
    WebElement searchButton;

    @FindBy(linkText = "iPhone")
    WebElement iphone;

    public void searchProduct(String product) {
        searchBox.clear();
        searchBox.sendKeys(product);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public boolean isProductDisplayed() {
        return iphone.isDisplayed();
    }
}