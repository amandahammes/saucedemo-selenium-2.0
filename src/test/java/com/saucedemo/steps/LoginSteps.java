package com.saucedemo.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
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
