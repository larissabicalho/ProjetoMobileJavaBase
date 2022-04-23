package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;


public class WebScreen extends PageBase {

    By textoSite = By.xpath("//android.widget.EditText[@text='http://www.amazon.com']");
    By validarGoogle = By.xpath("//android.widget.Image[@text='Google']");

    public WebScreen(){}

    public void clicarELimparHome(){
        waitForElement(textoSite);
        clear(textoSite);
        click(textoSite);
    }

    public void preencherSite(String site){
        sendKeysBoard(site);
    }

    public String validarMensagemGoogle(){
        return getText(validarGoogle);
    }

    public void clicarNoEnterParaSite(){
        clicarEmEnter();
    }


}
