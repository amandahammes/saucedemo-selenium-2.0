package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
    protected WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='title']")
    public WebElement tituloProdutos;
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    public WebElement itemSauceLabsBackPack;
    @FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-backpack']")
    public WebElement btnAddSauceLabsBackPack;
    @FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']")
    public WebElement btnAddBoltTshirt;
    @FindBy(xpath = "//a[@data-test='shopping-cart-link']")
    public WebElement carrinho;
    @FindBy(xpath = "//button[@data-test='checkout']")
    public WebElement btnCheckout;
    @FindBy(xpath = "//input[@data-test='firstName']")
    public WebElement inputNomeCheckout;
    @FindBy(xpath = "//input[@data-test='lastName']")
    public WebElement inputSobrenomeCheckout;
    @FindBy(xpath = "//input[@data-test='postalCode']")
    public WebElement inputCepCheckout;
    @FindBy(xpath = "//input[@data-test='continue']")
    public WebElement btnContinue;
    @FindBy(xpath = "//button[@data-test='finish']")
    public WebElement btnFinalizarCompra;
    @FindBy(xpath = "//span[@data-test='title']")
    public WebElement tituloCheckoutCompleto;
    @FindBy(xpath = "//div[@data-test='complete-text']")
    public WebElement textoCheckoutCompleto;
    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement mensagemErroCheckout;
    @FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
    public WebElement caminhoPagicaDescricaoItemOnesie;
    @FindBy(xpath = "//button[@data-test='add-to-cart']")
    public WebElement bntAddAoCarrinhoPaginaDescricao;
}