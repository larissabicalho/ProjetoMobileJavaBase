package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Flows.LoginFlows;
import JavaAppiumCucumberExtentReportsTemplate.Screens.HomeScreen;
import JavaAppiumCucumberExtentReportsTemplate.Screens.MenuScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;

public class MenuSteps {

    HomeScreen homeScreen;
    MenuScreen menuScreen;
    LoginFlows loginFlows;
    Scenario scenario;


    @And("clicar no menu Home")
    public void xpto2(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuHome();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar no menu Native")
    public void xpto6(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuNative();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    public void xpt5() {
        String s = null;
// String s1;
// String s2;
// String s3;

        Format formatter;
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("MMMM");
        Locale BRAZIL = new Locale("pt", "BR");

        df = DateFormat.getDateInstance(DateFormat.FULL, BRAZIL);

        s = df.format(date); // January

        System.out.println("Month : " + s);


        System.out.println(date);
    }
    @And("clicar no menu Web")
    public void xpto4(){
        menuScreen = new MenuScreen();
        menuScreen.clicarMenuWeb();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar mensagem de texto")
    public void xpto3(){
        System.out.println("finalizando");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }





}
