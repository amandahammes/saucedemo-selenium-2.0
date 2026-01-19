package com.saucedemo.validations;

import com.saucedemo.browser.Waits;
import com.saucedemo.pages.ShoppingPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ShoppingValidation {
    private WebDriver driver;
    private Waits wait;
    private ShoppingPage shoppingPage;

    public ShoppingValidation(WebDriver driver) {
        this.driver = driver;
        this.shoppingPage = new ShoppingPage(driver);
        this.wait = new Waits(driver);
    }
    public void validarPaginaDeProdutos(){
        wait.loadElement(shoppingPage.tituloProdutos);
        String textoProducts = shoppingPage.tituloProdutos.getText();
        Assertions.assertEquals("Products", textoProducts, "O login não foi realizado ou não redirecionou para a página de produtos!");
    }
    public void validarCompraEfetuadaComSucesso(){
        String tituloCheckoutCompleto = shoppingPage.tituloCheckoutCompleto.getText();
        String textoCheckoutCompleto = shoppingPage.textoCheckoutCompleto.getText();
        Assertions.assertEquals("Checkout: Complete!",tituloCheckoutCompleto);
        Assertions.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!", textoCheckoutCompleto);
    }
    public void validarMensagemErroCheckout(String mensagemErroEsperada){
        String mensagemErroCheckout = shoppingPage.mensagemErroCheckout.getText();
        Assertions.assertEquals(mensagemErroEsperada,mensagemErroCheckout);
    }
}
