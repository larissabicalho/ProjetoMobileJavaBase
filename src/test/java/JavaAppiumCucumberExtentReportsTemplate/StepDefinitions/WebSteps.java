package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Screens.WebScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class WebSteps {

    WebScreen webScreen;

    public WebSteps(){webScreen = new WebScreen();}

    @And("entrar no site")
    public void entrarNoSiteGoogle() {
        webScreen.clicarELimparHome();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("selecionar o site (.*)")
    public void selecionarOSite(String site){
        webScreen.preencherSite(site);
        webScreen.clicarNoEnterParaSite();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("valido o site")
    public void validarOSite(){
        Assert.assertEquals(webScreen.validarMensagemGoogle(), "Google");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
