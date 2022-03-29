package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Flows.LoginFlows;
import JavaAppiumCucumberExtentReportsTemplate.Screens.HomeScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.MenuScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class MenuSteps {

    HomeScreen homeScreen;
    MenuScreen menuScreen;
    LoginFlows loginFlows;
    Scenario scenario;


    @And("clicar no menu Home")
    public void xpto2(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuHome();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Native")
    public void xpto6(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuNative();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Nested Views")
    public void xpto8(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuNestedViews();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }


    @And("clicar no menu Web")
    public void xpto4(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuWeb();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Login")
    public void xpto11(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuLoginPage();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Input")
    public void xpto7(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuInputControl();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }


    @And("clicar no menu Crash/Bug")
    public void xpto9(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuCrash();
       getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Alerts")
    public void xpto10(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuAlerts();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu LocalWebView")
    public void xpto12(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuLocalWeb();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Fixtures")
    public void xpto13(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuFixtures();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Fixtures Blu")
    public void xpto14(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuFixturesBlu();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar mensagem de texto")
    public void xpto3(){
        System.out.println("finalizando");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }





}
