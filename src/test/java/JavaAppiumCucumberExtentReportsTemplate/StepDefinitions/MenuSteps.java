package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Screens.MenuScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class MenuSteps {

    MenuScreen menuScreen;

    public MenuSteps(){ menuScreen = new MenuScreen();}

    @And("clicar no menu Home")
    public void clicarMenuHome(){
        menuScreen.clicarMenuHome();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Native")
    public void clicarMenuNative(){
        menuScreen.clicarMenuNative();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Nested Views")
    public void clicarNestedViews(){
        menuScreen.clicarMenuNestedViews();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }


    @And("clicar no menu Web")
    public void clicarMenuWeb(){
        menuScreen.clicarMenuWeb();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Login")
    public void clicarMenuLogin(){
        menuScreen.clicarMenuLoginPage();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Input")
    public void clicarMenuInput(){
        menuScreen.clicarMenuInputControl();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }


    @And("clicar no menu Crash/Bug")
    public void clicarMenuCrash(){
        menuScreen.clicarMenuCrash();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Alerts")
    public void clicarMenuAlerts(){
        menuScreen.clicarMenuAlerts();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu LocalWebView")
    public void clicarMenuLocalWebView(){
        menuScreen.clicarMenuLocalWeb();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Fixtures")
    public void clicarMenuFixtures(){
        menuScreen.clicarMenuFixtures();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Fixtures Blu")
    public void clicarMenuFlixturesBlu(){
        menuScreen.clicarMenuFixturesBlu();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

}
