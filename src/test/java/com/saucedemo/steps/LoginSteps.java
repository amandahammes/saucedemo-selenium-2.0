package com.saucedemo.steps;

import com.saucedemo.browser.DriverManager;
import com.saucedemo.browser.TypeBrowser;
import com.saucedemo.interactions.LoginInteractions;
import com.saucedemo.validations.LoginValidation;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver;
    private LoginInteractions loginInteractions;
    private LoginValidation loginValidation;

    public LoginSteps() {
        this.driver = DriverManager.getDriver(TypeBrowser.CHROME);
        this.loginInteractions = new LoginInteractions(driver);
        this.loginValidation = new LoginValidation(driver);
    }
    @Dado("que estou na página de login do SauceDemo")
    public void acessarPaginaSauceDemo() {

    }
    @Quando("insiro o usuário {string} e a senha {string}")
    public void inserirUsuarioESenhaParaLogin(String usuario, String senha) {

    }
    @E("clico no botão de login")
    public void clicarBtnLogin() {

    }
    @Entao("devo ser redirecionado para a página de produtos")
    public void validarLoginAoIrParaPaginaDeProdutos() {

    }
}
