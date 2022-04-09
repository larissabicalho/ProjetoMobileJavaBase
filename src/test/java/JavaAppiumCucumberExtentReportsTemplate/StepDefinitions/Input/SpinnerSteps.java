package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.SpinnerScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class SpinnerSteps {
    SpinnerScreen spinnerScreen;

    public SpinnerSteps(){ spinnerScreen = new SpinnerScreen();}

    @And("clicar no menu Spinner")
    public void clicarNoMenuSpinner(){
        spinnerScreen.elementoSpinner();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no spinner (.*)")
    public void clicarNoSpinner(String option){
        spinnerScreen.clicarNoSpinner(option);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se spinner foi selecionado (.*)")
    public void verificarCheckbox(String spinner){
        Assert.assertEquals(spinnerScreen.verificarSpinner(), "Selected: "+spinner);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
