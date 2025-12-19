package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCartPage extends BasePage {
    private By productName = By.cssSelector("div.table-responsive table.table-bordered tbody tr td:nth-child(2) a");
    private By unitPrice = By.cssSelector("div.table-responsive table.table-bordered tbody tr td:nth-child(5)");
    private By totalPrice = By.cssSelector("div.table-responsive table.table-bordered tbody tr td:nth-child(6)");
    private By checkoutBtn = By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a");
    private By removeP = By.cssSelector("button[data-original-title='Remove']");


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

    public void clickcheckoutBtn() {
        click(checkoutBtn);
    }
    public boolean isCheckoutButtonDisplayed() {
        return isDisplayed(checkoutBtn);
    }
    public void cleanCart() { //Limpiamos el carrito para una nueva @regression y evitamos el paso extra en ProductPage
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(removeP)).click();
    }
}

