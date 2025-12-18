package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.automation.pages.HomePage;
import org.automation.pages.LogoutPage;
import org.testng.Assert;

public class LogoutDefinitions {
    private HomePage homePage;
    private LogoutPage logoutPage;

    public LogoutDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
        this.logoutPage = new LogoutPage(Hooks.getDriver());
    }

    @Y("vuelve al dropdown para desloguearse")
    public void vuelveAlDropdownParaDesloguearse() {
        homePage.goToLogout();
    }

    @Entonces("se realiza el logout correctamente")
    public void seRealizaElLogoutCorrectamente() {
        Assert.assertTrue(logoutPage.logoutTitleisDisplayed(), "Error en deslogueo");
    }
}
