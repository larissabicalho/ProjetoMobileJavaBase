package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class ToggleButtonScreen extends PageBase {
    By toggleClick = By.xpath("//android.widget.TextView[@text='Toggle Button']");
    By toggleButton = By.id("com.amazonaws.devicefarm.android.referenceapp:id/input_switch");
    By verificarSeToggleTaOn = By.xpath("//android.widget.FrameLayout[@content-desc='ON']");


    public void elementoToggle(){
        while(!returnElementDisplayedElement(toggleClick)){
            scrollUsingTouchActionsOnlyY(2);
        }
        click(toggleClick);
    }

    public void clicarElementoToggle(){
        waitForElement(toggleButton);
        click(toggleButton);
    }

    public Boolean verificarToggle(){
        waitForElement(verificarSeToggleTaOn);
        return returnElementDisplayed(verificarSeToggleTaOn);
    }
}
