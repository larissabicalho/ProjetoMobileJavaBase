package JavaAppiumCucumberExtentReportsTemplate.Screens.Native;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContentOutOfViewScreen extends PageBase {
    By menuContent = By.xpath("//android.widget.TextView[@text='Content Out of View']");
    By hiddenText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/hidden_text");

    public void clicarMenuContent(){
        while(!returnElementDisplayedElement(menuContent)){
            scrollUsingTouchActionsOnlyY(2);
        }
        click(menuContent);

    }

    public void scroolAteHidden(){
            topToBottonSwipe();
            topToBottonSwipe();
    }

    public String verificarSeOTextoAparecendo(){
        scroolAteHidden();
        waitForElementBeVisible(hiddenText);
        return getText(hiddenText);
    }



}
