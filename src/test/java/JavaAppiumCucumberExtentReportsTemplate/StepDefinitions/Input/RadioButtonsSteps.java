package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.RadioButtonsScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class RadioButtonsSteps {

    RadioButtonsScreen radioButtonsScreen;

    public RadioButtonsSteps() { radioButtonsScreen = new RadioButtonsScreen();}

    @And("clicar no menu RadioButton")
    public void clicarNoMenuRadio() {
        radioButtonsScreen.elementoRadio();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no radio (.*)")
    public void clicarNoRadio(String site) {
        radioButtonsScreen.radioClickWeb(site);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se o radio foi clicado (.*)")
    public void verificarRadio(String site) {
        Assert.assertEquals(radioButtonsScreen.verificarRadioWeb(), site);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
