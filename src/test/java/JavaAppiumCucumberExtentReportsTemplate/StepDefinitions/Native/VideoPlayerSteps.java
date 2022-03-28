package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Native;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.ContentScrollingScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.VideoPlayerScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class VideoPlayerSteps {


    VideoPlayerScreen videoPlayerScreen;
    @And("clicar no menu VideoPlayer")
    public void clicarNoVideoPlayer(){
        videoPlayerScreen = new VideoPlayerScreen();
        videoPlayerScreen.clicarMenuVideo();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se o video apareceu")
    public void verificarSeVideoAparece(){
        videoPlayerScreen = new VideoPlayerScreen();
        Assert.assertTrue(videoPlayerScreen.verificarSeOElementoExiste());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
