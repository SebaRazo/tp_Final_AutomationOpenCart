package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.automation.pages.MyAccountPage;
import org.automation.pages.ProductListPage;
import org.automation.pages.ProductPage;
import org.automation.pages.ShoppingCartPage;
import org.testng.Assert;

public class AddToCartDefinitions {
    private MyAccountPage myAccountPage;
    private ProductPage productPage;
    private ProductListPage productListPage;
    private ShoppingCartPage shoppingCartPage;

    public AddToCartDefinitions() {
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
        this.productPage = new ProductPage(Hooks.getDriver());
        this.productListPage = new ProductListPage(Hooks.getDriver());
        this.shoppingCartPage = new ShoppingCartPage(Hooks.getDriver());
    }
    @Y("busca un producto")
    public void buscaUnProducto() {
        myAccountPage.goToCameras();
        productListPage.goToProduct();
    }
    @Y("selecciona detalles y lo agrega al carrito")
    public void agregarAlCarrito() {
        productPage.addProductToCart();
        productPage.clickCart();
    }
    @Entonces("se verifica que el producto elegido se haya agregado correctamente")
    public void seVerificaQueElProductoSeHayaAgregadoCorrectamente() {
        Assert.assertEquals(shoppingCartPage.getProductCartName(), "Canon EOS 5D", "No coincide con el producto elegido");
        Assert.assertEquals(shoppingCartPage.getUnitPrice(), "$80.00", "No coincide el precio unitario del producto");
        Assert.assertEquals(shoppingCartPage.getTotalPrice(), "$240.00", "No coincide el precio total del producto");
        productPage.clickcheckoutBtn();

    }
}

