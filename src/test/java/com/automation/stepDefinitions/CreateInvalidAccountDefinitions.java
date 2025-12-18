package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.automation.pages.CreateAccountPage;
import org.testng.Assert;

public class CreateInvalidAccountDefinitions {
    private CreateAccountPage createAccountPage;
    public CreateInvalidAccountDefinitions() {
        this.createAccountPage = new CreateAccountPage(Hooks.getDriver());
    }
    @Cuando("el usuario no completa el formulario")
    public void elUsuarioNoCompletaElFormulario() {
        createAccountPage.invalidRegister("not_seba@gmail.com", "654321");
    }
    @Entonces("se verifica que la cuenta no se creo correctamente")
    public void seVerificaQueLaCuentaNoSeCreoCorrectamente() {
        Assert.assertTrue(createAccountPage.textIncompletedFieldIsDisplayed(), "Se permite no completar estos campos");
    }
}
