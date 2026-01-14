package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    protected WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement inputUsuario;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement inputSenha;
    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement botaoLogin;
    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement mensagemErro;
}
