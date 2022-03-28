package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class CheckboxScreen extends PageBase {
    By checkBoxClick = By.xpath("//android.widget.TextView[@text='Checkbox']");
    By checkBoxButton = By.id("com.amazonaws.devicefarm.android.referenceapp:id/input_checkbox");
    By validarCheckBox = By.xpath("//android.widget.TextView[@content-desc='Checkbox Display']");

    public void elementoCheckbox(){
        while(!returnElementDisplayedElement(checkBoxClick)){
            scrollUsingTouchActionsOnlyY(2);
        }
        click(checkBoxClick);
    }

    public void clicarCheckbox(){
        click(checkBoxButton);
    }

    public String verificarTextoCheckbox(){
        return getText(validarCheckBox);
    }


}
