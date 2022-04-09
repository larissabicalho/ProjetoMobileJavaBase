package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Bases.ReadToastMessage;
import JavaAppiumCucumberExtentReportsTemplate.Screens.AlertsScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.IOException;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class AlertsSteps {

    AlertsScreen alertsScreen;

    public AlertsSteps(){alertsScreen = new AlertsScreen();}

    @Then("clicar no Toast e validar Mensagem")
    public void clicarToastMenu() throws TesseractException, IOException {
        ReadToastMessage rdm = new ReadToastMessage();

        String msgEsperada = "Toast";

        String msgRetornada = alertsScreen.elementoToast();

        Assert.assertTrue(msgRetornada.contains(msgEsperada));

        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no botao Alert")
    public void clicarNoAlert(){
        alertsScreen.clicarNoAlert();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no botao Toast")
    public void clicarNoToast(){
        alertsScreen.clicarNoToast();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar a mensagem do alerta")
    public void verificarAlerta(){
        Assert.assertEquals(alertsScreen.getAlertText(),"This is the alert message");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
