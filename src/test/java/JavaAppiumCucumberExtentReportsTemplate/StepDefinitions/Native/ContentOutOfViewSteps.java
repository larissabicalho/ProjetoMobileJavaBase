package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Native;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.ContentOutOfViewScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.ContentScrollingScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class ContentOutOfViewSteps {

    ContentOutOfViewScreen contentOutOfViewScreen;
    @And("clicar no menu ContentOutOfView")
    public void clicarNoScrool(){
        contentOutOfViewScreen = new ContentOutOfViewScreen();
        contentOutOfViewScreen.clicarMenuContent();
        contentOutOfViewScreen.scroolAteHidden();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("verificar se o texto escondido aparece")
    public void verificarSeOTextoApareceu(){
        contentOutOfViewScreen = new ContentOutOfViewScreen();
        Assert.assertEquals(contentOutOfViewScreen.verificarSeOTextoAparecendo(),"This is hidden text");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
