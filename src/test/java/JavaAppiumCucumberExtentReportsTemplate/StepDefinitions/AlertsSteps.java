package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Bases.ReadToastMessage;
import JavaAppiumCucumberExtentReportsTemplate.Screens.AlertsScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.CrashScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.SubmitScreen;
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

    @Then("clicar no Toast e validar Mensagem")
    public void clicarToastMenu() throws TesseractException, IOException {
        alertsScreen = new AlertsScreen();
        ReadToastMessage rdm = new ReadToastMessage();

        String msgEsperada = "Toast";

        String msgRetornada = alertsScreen.elementoToast();

        Assert.assertTrue(msgRetornada.contains(msgEsperada));

        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no botao Alert")
    public void xpto1(){
        alertsScreen = new AlertsScreen();
        alertsScreen.clicarNoAlert();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no botao Toast")
    public void xpto2(){
        alertsScreen = new AlertsScreen();
        alertsScreen.clicarNoToast();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar a mensagem do alerta")
    public void xpto3(){
        alertsScreen = new AlertsScreen();
        Assert.assertEquals(alertsScreen.getAlertText(),"This is the alert message");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
