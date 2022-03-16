package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class MenuScreen extends PageBase {


    By inputControlMenu = By.xpath("(//android.widget.TextView[@content-desc=\"Row Category Name\"])[4]");

    By loginPageMenu = By.xpath("//android.widget.TextView[@text='Login Page']");

    By homeMenu = By.xpath("//android.widget.TextView[@text='Home']");

    By webMenu = By.xpath("//android.widget.TextView[@text='Web']");


    By NestedViewsMenu = By.xpath("//android.widget.TextView[@text='Nested Views']");


    public void clicarMenuInputControl(){
        click(inputControlMenu);
    }


    public void clicarMenuLoginPage(){
        click(loginPageMenu);
    }

    public void clicarMenuHome(){
        click(homeMenu);
    }

    public void clicarMenuWeb(){
        click(webMenu);
    }

    public void clicarMenuNestedViews(){
        click(NestedViewsMenu);
    }


}

