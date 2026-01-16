package com.saucedemo.validations;

import com.aventstack.extentreports.util.Assert;
import com.saucedemo.browser.Waits;
import com.saucedemo.pages.InventoryPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ShoppingValidation {
    private WebDriver driver;
    private Waits wait;
    private InventoryPage inventoryPage;

    public ShoppingValidation(WebDriver driver) {
        this.driver = driver;
        this.inventoryPage = new InventoryPage(driver);
        this.wait = new Waits(driver);
    }
    public void validarPaginaDeProdutos(){
        wait.loadElement(inventoryPage.tituloProdutos);
        String textoProducts = inventoryPage.tituloProdutos.getText();
        Assertions.assertEquals("Products", textoProducts, "O login não foi realizado ou não redirecionou para a página de produtos!");
    }
    public void validarCompraEfetuadaComSucesso(){
        String tituloCheckoutCompleto = inventoryPage.tituloCheckoutCompleto.getText();
        String textoCheckoutCompleto = inventoryPage.textoCheckoutCompleto.getText();
        Assertions.assertEquals("Checkout: Complete!",tituloCheckoutCompleto);
        Assertions.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!", textoCheckoutCompleto);
    }
    public void validarMensagemErroCheckout(String mensagemErroEsperada){
        String mensagemErroCheckout = inventoryPage.mensagemErroCheckout.getText();
        Assertions.assertEquals(mensagemErroEsperada,mensagemErroCheckout);
    }
}
