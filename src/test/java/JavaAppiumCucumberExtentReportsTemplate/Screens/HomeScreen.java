package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class HomeScreen extends PageBase {

    By menuButton = By.xpath("//android.widget.ImageButton[@content-desc=\"ReferenceApp\"]");

    By textoHome = By.xpath("//android.widget.TextView[@content-desc=\"Homepage Headline\"]");

    public HomeScreen(){}

    public void clicarMenu(){
        waitForElement(menuButton);
        click(menuButton);
    }

    public String validarTextoHome() {
       return getText(textoHome);
    }


}
