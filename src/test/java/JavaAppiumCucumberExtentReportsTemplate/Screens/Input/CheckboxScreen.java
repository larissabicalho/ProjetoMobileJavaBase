package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class CheckboxScreen extends PageBase {
    By checkBoxClick = By.xpath("//android.widget.TextView[@text='Checkbox']");
    By checkBoxButton = By.xpath("//android.widget.Checkbox[@text='Checkbox']");
    By validarCheckBox = By.xpath("//android.widget.TextView[@content-desc='Checkbox Display']");

    public void elementoCheckbox(){
        swipeElementWithDirection(checkBoxClick,"RIGHT");
        click(checkBoxClick);
    }

    public void clicarCheckbox(){
        click(checkBoxButton);
    }

    public String verificarTextoCheckbox(){
        return getText(validarCheckBox);
    }
}
