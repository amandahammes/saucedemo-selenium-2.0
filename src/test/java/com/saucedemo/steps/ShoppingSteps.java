package com.saucedemo.steps;

import com.saucedemo.browser.DriverManager;
import com.saucedemo.browser.TypeBrowser;
import com.saucedemo.interactions.ShoppingInteractions;
import com.saucedemo.validations.ShoppingValidation;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class ShoppingSteps {
    private WebDriver driver;
    private ShoppingInteractions shoppingInteractions;
    private ShoppingValidation shoppingValidation;

    public ShoppingSteps() {
        this.driver = DriverManager.getDriver(TypeBrowser.CHROME);
        this.shoppingInteractions = new ShoppingInteractions(driver);
        this.shoppingValidation = new ShoppingValidation(driver);
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
}
