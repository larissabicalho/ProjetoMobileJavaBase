package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Screens.HomeScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class HomeSteps {

    HomeScreen homeScreen;

    public HomeSteps(){homeScreen = new HomeScreen();}

    @Given("clicar no menu lateral")
    public void clicarLateral(){
        homeScreen.clicarMenu();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then ("valido frase Home")
    public void validarHome(){
        Assert.assertEquals(homeScreen.validarTextoHome(), "AWS Device Farm Sample App for Android");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then ("A mensagem da home inválida")
    public void validarHomeInvalido(){
        Assert.assertNotEquals(homeScreen.validarTextoHome(), "AWS Device");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }


}
