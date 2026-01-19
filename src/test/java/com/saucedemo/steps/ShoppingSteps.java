package com.saucedemo.steps;

import com.saucedemo.browser.DriverManager;
import com.saucedemo.browser.TypeBrowser;
import com.saucedemo.interactions.LoginInteractions;
import com.saucedemo.interactions.ShoppingInteractions;
import com.saucedemo.validations.LoginValidation;
import com.saucedemo.validations.ShoppingValidation;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class ShoppingSteps {
    private WebDriver driver;
    private ShoppingInteractions shoppingInteractions;
    private ShoppingValidation shoppingValidation;
    private LoginValidation loginValidation;
    private LoginInteractions loginInteractions;

    public ShoppingSteps() {
        this.driver = DriverManager.getDriver(TypeBrowser.CHROME);
        this.shoppingInteractions = new ShoppingInteractions(driver);
        this.shoppingValidation = new ShoppingValidation(driver);
        this.loginValidation = new LoginValidation(driver);
        this.loginInteractions = new LoginInteractions(driver);
    }

    @E("seleciono item para compra")
    public void selecionarItemParaCompra(){
        shoppingInteractions.selecionarItemParaCompra();
    }
    @Quando("vou para o carrinho")
    public void irParaCarrinho(){
        shoppingInteractions.irParaCarrinho();
    }
    @E("vou para o checkout")
    public void irParaCheckout(){
        shoppingInteractions.irParaCheckout();
    }
    @E("faço checkout com {string}, {string}, {string}")
    public void realizarCheckout(String nome, String sobrenome, String cep){
        shoppingInteractions.realizarCheckout(nome, sobrenome, cep);
    }
    @E("clico no botao continue")
    public void clicarBotaoContinueCheckout(){
        shoppingInteractions.clicarBotaoContinue();
    }
    @E("finalizo compra")
    public void finalizarCompra(){
        shoppingInteractions.finalizarCompra();
    }
    @Entao("devo visualizar mensagem de compra efetuada com sucesso")
    public void validarMensagemCompraComSucesso(){
        shoppingValidation.validarCompraEfetuadaComSucesso();
    }
    @Entao("a mensagem de {string} de checkout aparecerá em tela")
    public void validarMensagemDeErroDeCheckoutEmTela(String mensagemErro){
        shoppingValidation.validarMensagemErroCheckout(mensagemErro);
    }
    @E("seleciono dois itens para compra")
    public void selecionarDoisItensParaCompra(){
        shoppingInteractions.selecionarDoisItensParaCompra();
    }
    @E("entro na tela de descricao do item")
    public void entrarTelaDescricaoItem(){
        shoppingInteractions.irPaginaDescricaoItemOnesie();
    }
    @E("seleciono item para compra na tela de descricao de item")
    public void selecionarItemNaTelaDescricaoDoItem(){
        shoppingInteractions.colocarItemNoCarrinhoEmPaginaDescricaoItem();
    }
    @Dado("que estou logado com {string} na página SauceDemo")
    public void validarEstarLogadoPaginaSauceDemo(String tipoUsuario){
        loginInteractions.preencherCamposLoginESenha(tipoUsuario);
        loginInteractions.clicarBotaoLogin();
        shoppingValidation.validarPaginaDeProdutos();
    }
    @Quando("seleciono a opcao logout no menu")
    public void selecionarLogoutNoMenu(){
        shoppingInteractions.abrirMenuHamburguer();
        shoppingInteractions.selecionarBotaoLogout();
    }
    @Entao("devo ser direcionado para a página de login")
    public void validarPaginaLoginAoRealizarLogout(){
        loginValidation.validarPaginaLogin();
    }
}
