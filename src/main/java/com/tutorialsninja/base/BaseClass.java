package com.tutorialsninja.base;

import org.openqa.selenium.WebDriver;

import com.tutorialsninja.factory.DriverFactory;

public class BaseClass {

    protected WebDriver driver;

    public BaseClass() {

        driver = DriverFactory.getDriver();

    }

}