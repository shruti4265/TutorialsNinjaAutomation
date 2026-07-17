package com.tutorialsninja.stepdefinitions;

import org.testng.Assert;

import com.tutorialsninja.factory.DriverFactory;
import com.tutorialsninja.pages.AccountPage;
import com.tutorialsninja.pages.CartPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.SearchPage;
import com.tutorialsninja.utilities.ConfigReader;

import io.cucumber.java.en.*;

public class LoginSteps {

    HomePage homePage;
    LoginPage loginPage;
    AccountPage accountPage;
    SearchPage searchPage;
    ConfigReader config;
    ProductPage productPage;
    CartPage cartPage;

    @Given("User launches the browser")
    public void launchBrowser() {

        DriverFactory.getDriver();
        config = new ConfigReader();

    }

    @Given("User opens TutorialsNinja website")
    public void openWebsite() {

        DriverFactory.getDriver().get(config.getUrl());

        homePage = new HomePage(DriverFactory.getDriver());
        searchPage = new SearchPage(DriverFactory.getDriver());

    }

    // ---------------- LOGIN ----------------

    @When("User clicks on My Account")
    public void clickMyAccount() {

        homePage.clickMyAccount();

    }

    @When("User clicks on Login")
    public void clickLogin() {

        homePage.clickLogin();

        loginPage = new LoginPage(DriverFactory.getDriver());

    }

    @When("User enters email and password")
    public void enterCredentials() {

        loginPage.enterEmail(config.getEmail());
        loginPage.enterPassword(config.getPassword());

    }

    @When("User clicks Login button")
    public void clickLoginButton() {

        loginPage.clickLoginButton();

        accountPage = new AccountPage(DriverFactory.getDriver());

    }

    @Then("User should be logged in successfully")
    public void verifyLogin() {

        Assert.assertTrue(accountPage.isAccountPageDisplayed());

        DriverFactory.quitDriver();

    }

    // ---------------- SEARCH ----------------

    @When("User searches for product {string}")
    public void searchProduct(String product) {

        searchPage.searchProduct(product);
        searchPage.clickSearchButton();

    }

    @Then("Matching products should be displayed")
    public void verifyProduct() {

        Assert.assertTrue(searchPage.isProductDisplayed());

        DriverFactory.quitDriver();

    }

    // ---------------- CART ----------------

    @When("User opens the product")
    public void userOpensTheProduct() {

        productPage = new ProductPage(DriverFactory.getDriver());
        productPage.openProduct();

    }

    @When("User clicks Add To Cart")
    public void userClicksAddToCart() {

        productPage.addProductToCart();

    }

    @When("User opens Shopping Cart")
    public void userOpensShoppingCart() {

        cartPage = new CartPage(DriverFactory.getDriver());
        cartPage.openCart();

    }

    @Then("Product should be added successfully")
    public void verifyCart() {

        Assert.assertTrue(cartPage.verifyCartPage());

        DriverFactory.quitDriver();

    }

    // ---------------- LOGOUT ----------------

    @When("User clicks Logout")
    public void userClicksLogout() {

        accountPage.clickLogout();

    }

    @Then("User should be logged out successfully")
    public void verifyLogout() {

        Assert.assertTrue(accountPage.isLogoutSuccessful());

        DriverFactory.quitDriver();

    }

}