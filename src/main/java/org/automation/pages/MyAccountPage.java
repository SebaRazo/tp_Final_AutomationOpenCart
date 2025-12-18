package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{
    private By title = By.xpath("//*[@id=\"content\"]/h2[1]");
    private By camerasBtn = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[7]/a");
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    public boolean titleIsDisplayed() {
        return isDisplayed(title);
    }
    public void goToCameras() {
        click(camerasBtn);
    }
}
