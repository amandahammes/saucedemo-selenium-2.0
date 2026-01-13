package com.saucedemo.validations;

import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginValidation {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginValidation(WebDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
    }
}
