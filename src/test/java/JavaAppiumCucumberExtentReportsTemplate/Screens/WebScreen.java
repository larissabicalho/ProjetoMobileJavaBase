package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebScreen extends PageBase {

    By textoSite = By.xpath("//android.widget.EditText[@text='http://www.amazon.com']");
    By validarGoogle = By.xpath("//android.widget.Image[@text='Google']");


    public void clicarELimparHome(){
        waitForElement(textoSite);
        clear(textoSite);
        click(textoSite);
    }

    public void preencherSite(String site){
        sendKeys(textoSite, site);

    }

    public String validarMensagemGoogle(){
        return getText(validarGoogle);
    }

    public void clicarNoEnterParaSite(){
        clicarEmEnter();
    }


}
