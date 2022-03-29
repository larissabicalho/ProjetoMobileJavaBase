package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Flows.LoginFlows;
import JavaAppiumCucumberExtentReportsTemplate.Screens.HomeScreen;;

import JavaAppiumCucumberExtentReportsTemplate.Screens.MenuScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.io.IOException;
import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class HomeSteps {

    HomeScreen homeScreen;
    MenuScreen menuScreen;
    LoginFlows loginFlows;
    Scenario scenario;

    @Given("clicar no menu lateral")
    public void xpto1(){
        homeScreen = new HomeScreen();
        homeScreen.clicarMenu();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then ("valido frase Home")
    public void xpto2(){
        homeScreen = new HomeScreen();
        Assert.assertEquals(homeScreen.validarTextoHome(), "AWS Device Farm Sample App for Android");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then ("A mensagem da home inválida")
    public void xpto3(){
        homeScreen = new HomeScreen();
        Assert.assertNotEquals(homeScreen.validarTextoHome(), "AWS Device");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }


}
