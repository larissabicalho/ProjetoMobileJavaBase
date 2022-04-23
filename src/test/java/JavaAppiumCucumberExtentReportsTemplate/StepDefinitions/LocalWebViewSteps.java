package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Screens.LocalWebViewScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class LocalWebViewSteps {
    LocalWebViewScreen localWebViewScreen;

    public LocalWebViewSteps(){localWebViewScreen = new LocalWebViewScreen();}

    @And("verificar texto Principal")
    public void verificarTextoPrincipal() {
        Assert.assertEquals(localWebViewScreen.verificarTexto(),"Seattle");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("preencher nome (.*)")
    public void preencherName(String name) {
        localWebViewScreen.preencherName(name);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("preencher lastName (.*)")
    public void preencherLastName(String lastName) {
        localWebViewScreen.preencherLastName(lastName);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("verificar texto con nome (.*)")
    public void verificarTexto(String name) {
        Assert.assertEquals(localWebViewScreen.verificarTexto(),name);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
