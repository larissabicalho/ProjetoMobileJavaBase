package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Native;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.ContentScrollingScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class ContentScrollingSteps {

    ContentScrollingScreen contentScrollingScreen;
    @And("clicar no menu ContentScrolling (.*)")
    public void clicarNoScrool(String value){
        contentScrollingScreen = new ContentScrollingScreen();
        contentScrollingScreen.clicarMenuScrooling();
        contentScrollingScreen.scroolAteFinalDoTexto(value);
       // getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("texto final aparece")
    public void verificarTextoAparece(){
        contentScrollingScreen = new ContentScrollingScreen();
        Assert.assertTrue(contentScrollingScreen.verificarSeOTextoAparece());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
