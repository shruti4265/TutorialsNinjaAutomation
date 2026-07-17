package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "input-email")
    WebElement email;

    @FindBy(id = "input-password")
    WebElement password;

    @FindBy(css = "input[value='Login']")
    WebElement loginBtn;

    public void enterEmail(String userEmail) {

        email.sendKeys(userEmail);

    }

    public void enterPassword(String userPassword) {

        password.sendKeys(userPassword);

    }

    public void clickLoginButton() {

        loginBtn.click();

    }

}