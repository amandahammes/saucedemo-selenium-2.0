package com.saucedemo.interactions;

import com.saucedemo.pages.InventoryPage;
import org.openqa.selenium.WebDriver;

public class ShoppingInteractions {
    private WebDriver driver;
    private InventoryPage inventoryPage;

    public ShoppingInteractions(WebDriver driver) {
        this.driver = driver;
        this.inventoryPage = new InventoryPage(driver);
    }
    public void selecionarItemParaCompra(){
        inventoryPage.btnAddSauceLabsBackPack.click();
    }
    public void irParaCarrinho(){
        inventoryPage.carrinho.click();
    }
    public void irParaCheckout(){
        inventoryPage.btnCheckout.click();
    }
    public void realizarCheckout(String nome, String sobrenome, String cep){
        preencherNomeCheckout(nome);
        preencherSobrenomeCheckout(sobrenome);
        preencherCepCheckout(cep);
    }
    public void preencherNomeCheckout(String nome){
        inventoryPage.inputNomeCheckout.sendKeys(nome);
    }
    public void preencherSobrenomeCheckout(String sobrenome){
        inventoryPage.inputSobrenomeCheckout.sendKeys(sobrenome);
    }
    public void preencherCepCheckout(String cep){
        inventoryPage.inputCepCheckout.sendKeys(cep);
    }
    public void clicarBotaoContinue(){
        inventoryPage.btnContinue.click();
    }
    public void finalizarCompra(){
        inventoryPage.btnFinalizarCompra.click();
    }
    public void selecionarDoisItensParaCompra(){
        inventoryPage.btnAddSauceLabsBackPack.click();
        inventoryPage.btnAddBoltTshirt.click();
    }
    public void irPaginaDescricaoItemOnesie(){
        inventoryPage.caminhoPagicaDescricaoItemOnesie.click();
    }
    public void colocarItemNoCarrinhoEmPaginaDescricaoItem(){
        inventoryPage.bntAddAoCarrinhoPaginaDescricao.click();
    }
}
