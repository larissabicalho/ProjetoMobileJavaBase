package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.GesturesScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class GesturesSteps {
    GesturesScreen gesturesScreen;

    public GesturesSteps(){
        gesturesScreen = new GesturesScreen();
    }

    @And("clicar no menu Gestures")
    public void clicarNoMenuSpinner() {
        gesturesScreen.elementoGestures();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("escolher um método de Gestures LongPress")
    public void gesturesElementoLongPress(){
        gesturesScreen.longPresGestures();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("escolher um método de Gestures Tap")
    public void gesturesElementosTap(){
        gesturesScreen.tapGestures();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("escolher um método de Gestures Double Tap")
    public void gesturesElementosDoubleTap() throws InterruptedException {
        gesturesScreen.doubleTapGestures();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("escolher um método de Gestures Scroll")
    public void gesturesElementosScroll(){
        gesturesScreen.scrollGestures();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("escolher um método de Gestures Fling")
    public void gesturesElementosFling(){
        gesturesScreen.flyGestures();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verifica a ultima acao (.*)")
    public void verificarAcao(String acao){
        Assert.assertTrue(gesturesScreen.getAction().equals(acao));
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
