package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Native;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.CameraScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.VideoPlayerScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class CameraSteps {

    CameraScreen cameraScreen;
    @And("clicar no menu Camera")
    public void clicarNoVideoPlayer(){
        cameraScreen = new CameraScreen();
        cameraScreen.clicarMenuCamera();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se o camera apareceu")
    public void verificarSeVideoAparece(){
        cameraScreen = new CameraScreen();
        Assert.assertTrue(cameraScreen.verificarSeOElementoExiste());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
