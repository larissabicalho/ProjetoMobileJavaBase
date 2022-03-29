package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Screens.AlertsScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.FixturesScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;


public class FixturesSteps {

    FixturesScreen fixturesScreen;

    @Then("verificar Long")
    public void verificarLong(){
        fixturesScreen = new FixturesScreen();
        fixturesScreen.verificarLong();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
    @Then("verificar Lat")
    public void verificarLat(){
        fixturesScreen = new FixturesScreen();
        fixturesScreen.verificarLat();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
    @Then("verificar Wifi")
    public void verificarWifi(){
        fixturesScreen = new FixturesScreen();
        fixturesScreen.verificarWifi();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }


    @Then("verificar Blu True")
    public void verificarBluTrue(){
        fixturesScreen = new FixturesScreen();
        fixturesScreen.verificarBluTrue();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar Blu False")
    public void verificarBluFalse(){
        fixturesScreen = new FixturesScreen();
        fixturesScreen.verificarBluFalse();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar GPS")
    public void verificarGPS(){
        fixturesScreen = new FixturesScreen();
        fixturesScreen.verificarGPS();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar NFC")
    public void verificarNFC(){
        fixturesScreen = new FixturesScreen();
        fixturesScreen.verificarNFC();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
