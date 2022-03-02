package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Screens.HomeScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.LoginScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.MenuScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.IOException;
import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class HomeSteps {

    HomeScreen homeScreen;
    MenuScreen menuScreen;
    LoginScreen loginScreen;
    Scenario scenario;

    @Given("acesso o app")
    public void xpto() throws IOException {
        //acessar app - Hooks faz isto.
    }

    @Given("Clicar no menu lateral")
    public void xpto1(){
        homeScreen = new HomeScreen();
        homeScreen.clicarMenu();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Login")
    public void xpto2(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuLoginPage();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("serei feliz")
    public void xpto3(){
        System.out.println("finalizando");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }





}
