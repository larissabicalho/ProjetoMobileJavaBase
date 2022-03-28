package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.TextFieldScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class TextFieldSteps {

    TextFieldScreen textFieldScreen;
    @And("escrever Texto (.*)")
    public void clicarNoVideoPlayer(String texto){
        textFieldScreen = new TextFieldScreen();
        textFieldScreen.escreverTexto(texto);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar se o texto esta escrito (.*)")
    public void verificarTexto(String texto) {
        textFieldScreen = new TextFieldScreen();
        Assert.assertEquals(textFieldScreen.verificarSeEstaEscrito(),texto);
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
