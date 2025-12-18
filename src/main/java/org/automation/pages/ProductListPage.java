package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage extends BasePage{
    private By productBtn = By.xpath("//h4/a[contains(text(),\"Canon\")]");
    public ProductListPage(WebDriver driver) {
        super(driver);
    }
    public void goToProduct() {
        click(productBtn);
    }
}
