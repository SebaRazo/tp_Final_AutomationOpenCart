package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage{
    private By productName = By.cssSelector("div.table-responsive table.table-bordered tbody tr td:nth-child(2) a");
    private By unitPrice = By.cssSelector("div.table-responsive table.table-bordered tbody tr td:nth-child(5)");
    private By totalPrice = By.cssSelector("div.table-responsive table.table-bordered tbody tr td:nth-child(6)");
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }
    public String getProductCartName() {
        return getLocatorText(productName);
    }
    public String getUnitPrice() {
        return getLocatorText(unitPrice);
    }
    public String getTotalPrice() {
        return getLocatorText(totalPrice);
    }
}
