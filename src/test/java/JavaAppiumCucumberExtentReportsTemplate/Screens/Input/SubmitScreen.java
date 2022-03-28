package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import JavaAppiumCucumberExtentReportsTemplate.Bases.ReadToastMessage;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;

import java.io.IOException;

public class SubmitScreen extends PageBase {

    ReadToastMessage readToastMessage;

    By submitClick = By.xpath("//android.widget.TextView[@text='Submit Button']");
    By submitButton = By.xpath("//android.widget.Button[@content-desc='Submit Button']");


    public void elementoSubmit(){
        while(!returnElementDisplayedElement(submitClick)){
            scrollUsingTouchActionsOnlyY(2);
        }
        click(submitClick);
    }

    public String elementoToastSubmit() throws TesseractException, IOException {
        readToastMessage = new ReadToastMessage();
        click(submitButton);
        String result = readToastMessage.readToastMessage();
        return result;
    }
}
