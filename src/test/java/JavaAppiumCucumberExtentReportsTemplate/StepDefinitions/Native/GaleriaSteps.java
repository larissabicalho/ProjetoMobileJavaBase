package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Native;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.CameraScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.util.Assert;

public class GaleriaSteps {

    CameraScreen cameraScreen;

    @Then("verificar se existe galeria")
    public void verificarSeExisteGaleria(){
        cameraScreen = new CameraScreen();
        Assert.isTrue(cameraScreen.verificarSeExisteGaleria());
    }

    @And("verificar o resto das imagens")
    public void verificarORestoDaImagem(){
        cameraScreen = new CameraScreen();
        Assert.isTrue(cameraScreen.scroolElementosGaleria());


    }

}
