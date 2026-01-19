package com.saucedemo.interactions;

import com.saucedemo.browser.Waits;
import com.saucedemo.pages.ShoppingPage;
import org.openqa.selenium.WebDriver;

public class ShoppingInteractions {
    private WebDriver driver;
    private ShoppingPage shoppingPage;
    private Waits waits;

    public ShoppingInteractions(WebDriver driver) {
        this.driver = driver;
        this.waits = new Waits(driver);
        this.shoppingPage = new ShoppingPage(driver);
    }
    public void selecionarItemParaCompra(){
        shoppingPage.btnAddSauceLabsBackPack.click();
    }
    public void irParaCarrinho(){
        shoppingPage.carrinho.click();
    }
    public void irParaCheckout(){
        shoppingPage.btnCheckout.click();
    }
    public void realizarCheckout(String nome, String sobrenome, String cep){
        preencherNomeCheckout(nome);
        preencherSobrenomeCheckout(sobrenome);
        preencherCepCheckout(cep);
    }
    public void preencherNomeCheckout(String nome){
        shoppingPage.inputNomeCheckout.sendKeys(nome);
    }
    public void preencherSobrenomeCheckout(String sobrenome){
        shoppingPage.inputSobrenomeCheckout.sendKeys(sobrenome);
    }
    public void preencherCepCheckout(String cep){
        shoppingPage.inputCepCheckout.sendKeys(cep);
    }
    public void clicarBotaoContinue(){
        shoppingPage.btnContinue.click();
    }
    public void finalizarCompra(){
        shoppingPage.btnFinalizarCompra.click();
    }
    public void selecionarDoisItensParaCompra(){
        shoppingPage.btnAddSauceLabsBackPack.click();
        shoppingPage.btnAddBoltTshirt.click();
    }
    public void irPaginaDescricaoItemOnesie(){
        shoppingPage.caminhoPagicaDescricaoItemOnesie.click();
    }
    public void colocarItemNoCarrinhoEmPaginaDescricaoItem(){
        shoppingPage.bntAddAoCarrinhoPaginaDescricao.click();
    }
    public void abrirMenuHamburguer(){
        shoppingPage.btnMenuHamburguer.click();
    }
    public void selecionarBotaoLogout(){
        waits.loadElement(shoppingPage.btnLogout);
        shoppingPage.btnLogout.click();
    }
}
