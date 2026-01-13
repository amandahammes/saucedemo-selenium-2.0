package com.saucedemo.validations;

import org.junit.jupiter.api.Assertions;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginValidation {

    private WebDriver driver;
    private LoginPage loginPage;

    public LoginValidation(WebDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
    }
    public void validarPaginaLogin(){
        String textoBotao = loginPage.botaoLogin.getAttribute("value");
        Assertions.assertEquals( "Login", textoBotao, "");
    }
    public void validarMensagemDeErroDoLogin(String mensagemErro){
        String textoMensagemErro = loginPage.mensagemErro.getText();
        Assertions.assertEquals(mensagemErro, textoMensagemErro, "Mensagem de erro incorreta!");
    }
}
