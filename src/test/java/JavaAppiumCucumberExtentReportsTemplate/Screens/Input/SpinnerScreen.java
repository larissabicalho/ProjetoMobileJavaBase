package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class SpinnerScreen extends PageBase {
    By spinnerClick = By.xpath("//android.widget.Spinner[@content-desc='Spinner Control']");
    String spinnerOption = "//android.widget.TextView[@text='###']";
    By verificarOption = By.xpath("//android.widget.TextView[@content-desc='Spinner Display']");

    public void elementoSpinner(){
        while(!returnElementDisplayedElement(spinnerClick)){
            scrollUsingTouchActionsOnlyY(2);
        }
        click(spinnerClick);


    }

    public void clicarNoSpinner(String option)
    {
        spinnerOption = spinnerOption.replace("###",option);
        click(By.xpath(spinnerOption));
    }

    public String verificarSpinner(){
        waitForElement(verificarOption);
        return getText(verificarOption);
    }


}
