package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Screens.FixturesScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;


public class FixturesSteps {

    FixturesScreen fixturesScreen;

    public FixturesSteps(){fixturesScreen = new FixturesScreen();}

    @Then("verificar Long")
    public void verificarLong(){
        fixturesScreen.verificarLong();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
    @Then("verificar Lat")
    public void verificarLat(){
        fixturesScreen.verificarLat();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
    @Then("verificar Wifi")
    public void verificarWifi(){
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
        fixturesScreen.verificarBluFalse();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar GPS")
    public void verificarGPS(){
        fixturesScreen.verificarGPS();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar NFC")
    public void verificarNFC(){
        fixturesScreen.verificarNFC();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
