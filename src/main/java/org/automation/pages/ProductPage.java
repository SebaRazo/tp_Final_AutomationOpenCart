package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{
    private By inputCant = By.xpath("//*[@id=\"input-quantity\"]");
    private By selectOption = By.xpath("//*[@id=\"input-option226\"]");
    private By colorRedOption = By.xpath("//option[@value=\"15\"]");
    private By addToCartBtn = By.xpath("//*[@id=\"button-cart\"]");
    private By cartBtn = By.xpath("//*[@id=\"cart\"]/button");
    private By viewCartBtn = By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]");
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickCart(){
        click(cartBtn);
        click(viewCartBtn);
    }
    public void addProductToCart(){
        click(selectOption);
        click(colorRedOption);
        clear(inputCant);
        sendKeys(inputCant, "3");
        click(addToCartBtn);
    }
}
