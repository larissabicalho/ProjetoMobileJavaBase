package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Native;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.ContentScrollingScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ContentScrollingSteps {

    ContentScrollingScreen contentScrollingScreen;
    @And("clicar no menu ContentScrolling (.*)")
    public void clicarNoScrool(String value){
        contentScrollingScreen = new ContentScrollingScreen();
        contentScrollingScreen.clicarMenuScrooling();
        contentScrollingScreen.scroolAteFinalDoTexto(value);
    }

    @Then("texto final aparece")
    public Boolean verificarTextoAparece(){
        contentScrollingScreen = new ContentScrollingScreen();
        return contentScrollingScreen.verificarSeOTextoAparece();
    }

}
