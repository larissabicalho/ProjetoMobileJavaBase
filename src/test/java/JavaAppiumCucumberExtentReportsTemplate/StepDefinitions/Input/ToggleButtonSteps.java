package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.CheckboxScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.TextFieldScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.ToggleButtonScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class ToggleButtonSteps {

    ToggleButtonScreen toggleButtonScreen;
    @And("clicar no menu ToggleButton")
    public void clicarNoMenuToggleButton(){
        toggleButtonScreen = new ToggleButtonScreen();
        toggleButtonScreen.elementoToggle();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no toggle")
    public void clicarNoToggle(){
        toggleButtonScreen = new ToggleButtonScreen();
        toggleButtonScreen.clicarElementoToggle();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se toggle foi clicado")
    public void verificarToggleOn(){
        toggleButtonScreen = new ToggleButtonScreen();
        Assert.assertTrue(toggleButtonScreen.verificarToggle());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
