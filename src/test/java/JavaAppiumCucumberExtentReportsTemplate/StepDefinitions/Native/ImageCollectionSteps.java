package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Native;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.CheckboxScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.ImageCollectionScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class ImageCollectionSteps {

    ImageCollectionScreen imageCollectionScreen;

    @Then("verificar se existe galeria")
    public void verificarSeExisteGaleria(){
        imageCollectionScreen = new ImageCollectionScreen();
        Assert.assertTrue(imageCollectionScreen.verificarSeExisteGaleria());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("verificar o resto das imagens")
    public void verificarORestoDaImagem(){
        imageCollectionScreen = new ImageCollectionScreen();
        Assert.assertTrue(imageCollectionScreen.scroolElementosGaleria());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");


    }

}
