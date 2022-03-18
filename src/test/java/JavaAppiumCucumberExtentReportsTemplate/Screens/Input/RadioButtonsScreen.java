package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class RadioButtonsScreen extends PageBase {
    By radioClick = By.xpath("//android.widget.TextView[@text='Radio Buttom']");
    By radioButtonWeb = By.xpath("//android.widget.RadioButton[@content-desc='Radio Button 2']");
    By verificarWeb = By.xpath("//android.widget.TextView[@content-desc='Radio Button Display']");

    public void elementoRadio(){
        swipeElementWithDirection(radioClick,"RIGHT");
        click(radioClick);
    }

    public void radioClickWeb(){
        waitForElement(radioButtonWeb);
        click(radioButtonWeb);
    }

    public String verificarRadioWeb(){
        return getText(verificarWeb);
    }
}
