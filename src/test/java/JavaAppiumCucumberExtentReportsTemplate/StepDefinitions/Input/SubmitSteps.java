package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.ReadToastMessage;
import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.SpinnerScreen;
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

public class SubmitSteps {

    SubmitScreen submitScreen;
    @And("clicar no menu Submit")
    public void clicarNoMenuSpinner(){
        submitScreen = new SubmitScreen();
        submitScreen.elementoSubmit();
     //   getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("clicar no submit Toast e validar Mensagem")
    public void clicarSubmit() throws TesseractException, IOException {
        submitScreen = new SubmitScreen();
        ReadToastMessage rdm = new ReadToastMessage();

        String msgEsperada = "Submitted";

        String msgRetornada = submitScreen.elementoToastSubmit();

        Assert.assertTrue(msgRetornada.contains(msgEsperada));

        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
