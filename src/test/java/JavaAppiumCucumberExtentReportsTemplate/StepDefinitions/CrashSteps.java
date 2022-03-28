package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Screens.CrashScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.HomeScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class CrashSteps {

    CrashScreen crashScreen;
    @Then("verificar se existe o botao crash")
    public void xpto1(){
        crashScreen = new CrashScreen();
        Assert.assertTrue(crashScreen.verificarNoCrash());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
