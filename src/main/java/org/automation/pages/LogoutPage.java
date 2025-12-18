package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage{
    public LogoutPage(WebDriver driver) {
        super(driver);
    }
    private By logoutTitle = By.xpath("//p[contains(text(),\"You have been logged off your account\")]");
    private By logoutContinueBtn = By.xpath("//a[text()=\"Continue\"]");
    public boolean logoutTitleisDisplayed() {
        return isDisplayed(logoutTitle);
    }
    public void goToContinueBtn() {
        click(logoutContinueBtn);
    }
}
