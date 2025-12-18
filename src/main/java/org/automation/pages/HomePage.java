package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private WebDriver driver;

    private By searchInput = By.xpath("//input[@name=\"search\"]");
    private By searchButton = By.xpath("//button[@class=\"btn btn-default btn-lg\"]");
    private By carrousel = By.xpath("//div[@id=\"slideshow0\"]");
    private By navbar = By.xpath("//nav[@id=\"menu\"]");
    private By myAccountDropdown = By.xpath("//li/a[@title=\"My Account\"]");
    private By loginDropdown = By.xpath("//li/a[text()=\"Login\"]");
    private By registerDropdown = By.xpath("//li/a[text()=\"Register\"]");
    private By logoutBtn = By.xpath("//li/a[text()=\"Logout\"]");
    public HomePage(WebDriver driver){
        super(driver);
    }
    public boolean searchIsDisplayed() {
        return isDisplayed(searchInput);
    }
    public boolean carrouselIsDisplayed() {
        return isDisplayed(carrousel);
    }
    public boolean navbarIsDisplayed() {
        return isDisplayed(navbar);
    }
    public boolean myAccountDropdownIsDisplayed() {
        return isDisplayed(myAccountDropdown);
    }
    public void search(String text) {
        sendKeys(searchInput, text);
        click(searchButton);
    }
    public void goToLogin() {
        click(myAccountDropdown);
        click(loginDropdown);
    }
    public void goToRegister() {
        click(myAccountDropdown);
        click(registerDropdown);
    }
    public void goToLogout() {
        click(myAccountDropdown);
        click(logoutBtn);
    }

}
