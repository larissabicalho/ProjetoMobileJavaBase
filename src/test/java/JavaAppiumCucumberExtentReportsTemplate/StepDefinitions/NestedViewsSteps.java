package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Screens.NestedViewsScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class NestedViewsSteps {

    NestedViewsScreen nestedViewsScreen ;

    @And("clicar no Up Navigation")
    public void clicarNoUp() {
        nestedViewsScreen = new NestedViewsScreen();
        nestedViewsScreen.clicarNoUp();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no Back Navigation")
    public void clicarNoBack() {
        nestedViewsScreen = new NestedViewsScreen();
        nestedViewsScreen.clicarNoBack();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no Next Level")
    public void clicarNoNextLevel(){
        nestedViewsScreen = new NestedViewsScreen();
        nestedViewsScreen.clicarNoNextLevel();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no Next Level Back (.*)")
    public void clicarNoNextLevelBack(String valor){
        nestedViewsScreen = new NestedViewsScreen();
        nestedViewsScreen.clicarNoNextLeveBack(valor);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar Final Level")
    public void verificarTexto(){
        nestedViewsScreen = new NestedViewsScreen();
        Assert.assertEquals(nestedViewsScreen.verificarFinalLevel(),"Final Level");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar quantidade de level (.*)")
    public void verificarValor(String view){
        nestedViewsScreen = new NestedViewsScreen();
        Assert.assertEquals(nestedViewsScreen.verificarLevel(), view);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se voltou para inicial")
    public void verificarValor(){
        nestedViewsScreen = new NestedViewsScreen();
        Assert.assertTrue(nestedViewsScreen.verificarSeVoltouPrincipal());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no Back Navigation Menu Principal")
    public void clicarNoBackPrincipal(){
        nestedViewsScreen = new NestedViewsScreen();
        nestedViewsScreen.clicarNoBackPrincipal();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
