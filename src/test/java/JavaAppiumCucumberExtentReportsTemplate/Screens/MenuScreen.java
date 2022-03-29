package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class MenuScreen extends PageBase {


    By inputControlMenu = By.xpath("(//android.widget.TextView[@content-desc=\"Row Category Name\"])[4]");

    By loginPageMenu = By.xpath("//android.widget.TextView[@text='Login Page']");

    By homeMenu = By.xpath("//android.widget.TextView[@text='Home']");

    By webMenu = By.xpath("//android.widget.TextView[@text='Web']");

    By nativeMenu = By.xpath("//android.widget.TextView[@text='Native Components']");

    By nestedViewsMenu = By.xpath("//android.widget.TextView[@text='Nested Views']");

    By crashBugMenu = By.xpath("//android.widget.TextView[@text='Crash/Bug']");

    By alertsMenu = By.xpath("//android.widget.TextView[@text='Alerts']");

    By localMenu = By.xpath("//android.widget.TextView[@text='Local Web View']");

    By fixturesMenu = By.xpath("//android.widget.TextView[@text='Fixtures']");

    By clicarPermitir = By.id("android:id/button1");

    public void clicarMenuInputControl(){
        click(inputControlMenu);
    }


    public void clicarMenuLoginPage(){
        click(loginPageMenu);
    }

    public void clicarMenuAlerts(){
        click(alertsMenu);
    }

    public void clicarMenuHome(){
        click(homeMenu);
    }

    public void clicarMenuWeb(){
        click(webMenu);
    }

    public void clicarMenuNative(){
        click(nativeMenu);
    }

    public void clicarMenuNestedViews(){
        click(nestedViewsMenu);
    }

    public void clicarMenuCrash(){
        click(crashBugMenu);
    }

    public void clicarMenuLocalWeb(){
        scrollTexto(loginPageMenu);
        click(localMenu);
    }

    public void clicarMenuFixtures(){
        scrollTexto(loginPageMenu);
        click(fixturesMenu);
    }

    public void clicarMenuFixturesBlu(){
        validarComando();
        click(clicarPermitir);
        scrollTexto(loginPageMenu);
        click(fixturesMenu);
    }



}

