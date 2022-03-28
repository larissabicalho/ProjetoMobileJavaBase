package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.CheckboxScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.TextFieldScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class CheckboxSteps {

    CheckboxScreen checkboxScreen;

    @And("clicar no menu Checkbox")
    public void clicarNoMenuCheckbox(){
        checkboxScreen = new CheckboxScreen();
        checkboxScreen.elementoCheckbox();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no checkbox")
    public void clicarNoCheckbox(){
        checkboxScreen = new CheckboxScreen();
        checkboxScreen.clicarCheckbox();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se o checkbox foi clicado")
    public void verificarCheckbox(){
        checkboxScreen = new CheckboxScreen();
        Assert.assertEquals(checkboxScreen.verificarTextoCheckbox(), "Checked");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
