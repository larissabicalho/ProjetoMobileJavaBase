package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions.Input;

import JavaAppiumCucumberExtentReportsTemplate.Screens.Input.PullToRefreshScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class PullToRefreshSteps {

    PullToRefreshScreen pullToRefreshScreen;

    public PullToRefreshSteps(){
        pullToRefreshScreen = new PullToRefreshScreen();
    }

    @And("clicar no menu PullToRefresh")
    public void clicarNoMenuSpinner(){
        pullToRefreshScreen.elementoPull();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("faz o pull refresh na tela")
    public void pushNaTela(){
        pullToRefreshScreen.elementoPushSwipe();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar hora atual aparecendo")
    public void verificarHoraAtual(){
        Assert.assertNotNull(pullToRefreshScreen.verificarSeExisteHora());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
