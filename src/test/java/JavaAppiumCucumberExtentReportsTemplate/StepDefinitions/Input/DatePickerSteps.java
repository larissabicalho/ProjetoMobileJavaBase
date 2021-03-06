package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.DatePickerScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class DatePickerSteps {

    DatePickerScreen datePickerScreen;

    public DatePickerSteps(){
        datePickerScreen = new DatePickerScreen();
    }

    @And("clicar no menu DatePickerScreen")
    public void clicarNoMenuDatePickerScreen(){
        datePickerScreen.elementoDate();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("mudar o ano")
    public void clicarNaData(){
        datePickerScreen.procurarAData();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar mudar o mes para anterior")
    public void clicarAnterior(){
        datePickerScreen.procurarOMes();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("mudar o dia (.*)")
    public void clicarNoDia(String num){
        datePickerScreen.trocarODia(num);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar o ano")
    public void verificarOMes(){
        Assert.assertTrue(datePickerScreen.verificarAno());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
