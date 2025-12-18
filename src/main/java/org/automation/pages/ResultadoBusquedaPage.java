package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultadoBusquedaPage {
    private By titleSearch = By.xpath("//h1[text()=\"Search - iphone\"]");

    private WebDriver driver;

    public ResultadoBusquedaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        WebElement element = driver.findElement(titleSearch);
        return element.getText();
    }
}
