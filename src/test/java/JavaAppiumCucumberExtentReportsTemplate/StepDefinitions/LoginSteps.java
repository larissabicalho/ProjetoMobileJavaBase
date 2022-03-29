package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Enums.Users;
import JavaAppiumCucumberExtentReportsTemplate.Flows.LoginFlows;
import JavaAppiumCucumberExtentReportsTemplate.Screens.LoginScreen;
import JavaAppiumCucumberExtentReportsTemplate.Utils.Arquivos;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.FileNotFoundException;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;


public class LoginSteps {

    LoginFlows loginFlows;
    LoginScreen loginScreen;

    @And("efetuar o login")
    public void fazerLogin() throws FileNotFoundException {
        Users usersDados = Arquivos.getJsonUsers();
        loginFlows = new LoginFlows();
        loginFlows.efetuarLogin(usersDados.getUser(), usersDados.getSenha());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("efetuar o login errado")
    public void fazerLoginErrado() throws FileNotFoundException {
        Users usersDados = Arquivos.getJsonUsers();
        loginFlows = new LoginFlows();
        loginFlows.efetuarLogin(usersDados.getUserErrado(), usersDados.getSenhaErrada());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar Logout")
    public void clicarLogout() throws FileNotFoundException {
        loginScreen = new LoginScreen();
        loginScreen.clicarEmLogout();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar Login Admin")
    public void verificarLogin() throws FileNotFoundException {
        loginFlows = new LoginFlows();
        loginScreen = new LoginScreen();
        Assert.assertEquals(loginScreen.verificarMessageLogin(),"You are logged on as admin");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("verificar tela principal")
    public void verificarTelaPrincipal() throws FileNotFoundException {
        loginScreen = new LoginScreen();
        Assert.assertTrue(loginScreen.verificarSeVoltouParaInicial());
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @Then("verificar Login Errado")
    public void verificarLoginErrado() throws FileNotFoundException {
        loginFlows = new LoginFlows();
        loginScreen = new LoginScreen();
        Assert.assertEquals(loginScreen.verificarMessageLogin(),"You gave me the wrong username and password");
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }

    @And("clicar TryButton")
    public void clicarTryButton() throws FileNotFoundException {
        loginScreen = new LoginScreen();
        loginScreen.clicarTryButton();
        getScenario().embed(((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
