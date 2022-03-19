package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Native;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Native.ContentScrollingScreen;
import io.cucumber.java.en.And;

public class ContentScrollingSteps {

    ContentScrollingScreen contentScrollingScreen;
    @And("clicar no menu ContentScrolling")
    public void clicarNoScrool(){
        contentScrollingScreen = new ContentScrollingScreen();
        contentScrollingScreen.clicarMenuScrooling();
        contentScrollingScreen.scroolAteFinalDoTexto();

    }
}
