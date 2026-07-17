package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

    WebDriver driver;

    public AccountPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(linkText = "Logout")
    WebElement logout;

    @FindBy(xpath = "//h1[text()='My Account']")
    WebElement accountHeading;

    @FindBy(xpath = "//h1[text()='Account Logout']")
    WebElement logoutHeading;

    public boolean isAccountPageDisplayed() {

        return accountHeading.isDisplayed();

    }

    public void clickLogout() {

        logout.click();

    }

    public boolean isLogoutSuccessful() {

        return logoutHeading.isDisplayed();

    }

}