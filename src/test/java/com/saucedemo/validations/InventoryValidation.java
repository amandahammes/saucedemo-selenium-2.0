package com.saucedemo.validations;

import com.saucedemo.browser.Waits;
import com.saucedemo.pages.InventoryPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class InventoryValidation {
    private WebDriver driver;
    private Waits wait;
    private InventoryPage inventoryPage;

    public InventoryValidation(WebDriver driver) {
        this.driver = driver;
        this.inventoryPage = new InventoryPage(driver);
        this.wait = new Waits(driver);
    }
    public void validarPaginaDeProdutos(){
        wait.loadElement(inventoryPage.tituloProdutos);
        String textoProducts = inventoryPage.tituloProdutos.getText();
        Assertions.assertEquals("Products", textoProducts, "O login não foi realizado ou não redirecionou para a página de produtos!");
    }
}
