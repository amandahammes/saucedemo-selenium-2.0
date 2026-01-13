package com.saucedemo.interactions;

import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginInteractions {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginInteractions(WebDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
    }

    public void preencherCamposLoginESenha(){
        loginPage.inputUsuario.sendKeys();
    }
}
