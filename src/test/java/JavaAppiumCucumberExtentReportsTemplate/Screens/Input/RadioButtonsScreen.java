package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class RadioButtonsScreen extends PageBase {
    By radioClick = By.xpath("//android.widget.TextView[@text='Radio Buttons']");
    By verificarWeb = By.xpath("//android.widget.TextView[@content-desc='Radio Button Display']");
    String radioButtonWeb = "//android.widget.RadioButton[@text='###']";

    public void elementoRadio(){
        while(!returnElementDisplayedElement(radioClick)){
            scrollUsingTouchActionsOnlyY(2);
        }
        click(radioClick);
    }

    public void radioClickWeb(String site){
        radioButtonWeb = radioButtonWeb.replace("###",site);
        waitForElement(By.xpath(radioButtonWeb));
        click(By.xpath(radioButtonWeb));
    }

    public String verificarRadioWeb(){
        return getText(verificarWeb);
    }
}
