package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.TimePickerScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.text.ParseException;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class TimePickerSteps {

    TimePickerScreen timePickerScreen;


    public TimePickerSteps(){ timePickerScreen = new TimePickerScreen();}

    @And("clicar no menu TimePickerScreen")
    public void clicarNoMenuTimePickerScreen(){
        timePickerScreen.elementoTime();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("adicionar hora (.*) e minuto (.*)")
    public void colocarDataEHora(String hora, String minuto){
        timePickerScreen.timePickerTipo(hora,minuto);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("colocar o turno (.*)")
    public void colocarTurno(String turno){
        timePickerScreen.clicarSeAMPM(turno);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("verificar se hora (.*) e minutos (.*) e qual turno (.*)")
    public void colocarTurno(String hora, String minuto,String turno) throws ParseException {
        Assert.assertTrue(timePickerScreen.verificarTempo(hora,minuto,turno));
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
