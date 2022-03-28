package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.GesturesScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.PullToRefreshScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class GesturesSteps {
    GesturesScreen gesturesScreen;
    @And("clicar no menu Gestures")
    public void clicarNoMenuSpinner() throws InterruptedException {
        gesturesScreen = new GesturesScreen();
        gesturesScreen.elementoGestures();
      //  gesturesScreen.scrollGestures();
//       gesturesScreen.doubleTap2();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("escolher um método de Gestures LongPress")
    public void gesturesElementoLongPress() throws InterruptedException {
        gesturesScreen = new GesturesScreen();
        gesturesScreen.longPresGestures();
        }

    @And("escolher um método de Gestures Tap")
    public void gesturesElementosTap() throws InterruptedException {
        gesturesScreen = new GesturesScreen();
        gesturesScreen.tapGestures();
    }

    @And("escolher um método de Gestures Double Tap")
    public void gesturesElementosDoubleTap() throws InterruptedException {
        gesturesScreen = new GesturesScreen();
        gesturesScreen.doubleTapGestures();
    }

    @And("escolher um método de Gestures Scroll")
    public void gesturesElementosScroll() throws InterruptedException {
        gesturesScreen = new GesturesScreen();
        gesturesScreen.scrollGestures();
    }

    @And("escolher um método de Gestures Fling")
    public void gesturesElementosFling() throws InterruptedException {
        gesturesScreen = new GesturesScreen();
        gesturesScreen.flyGestures();
    }

    @Then("verifica a ultima acao (.*)")
    public void verificarAcao(String acao){
        System.out.println(gesturesScreen.getAction());
        Assert.assertTrue(gesturesScreen.getAction().equals(acao));
    }
}
