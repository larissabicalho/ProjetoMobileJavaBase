package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import JavaAppiumCucumberExtentReportsTemplate.Bases.ReadToastMessage;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;

import java.io.IOException;

public class AlertsScreen extends PageBase {
    By botaoToast = By.id("com.amazonaws.devicefarm.android.referenceapp:id/notifications_toast_button");
    By botaoAlert = By.id("com.amazonaws.devicefarm.android.referenceapp:id/notifications_alert_button");
    By alertMessage = By.id("android:id/message");

    ReadToastMessage readToastMessage;

    public void clicarNoAlert(){
        waitForElement(botaoAlert);
        click(botaoAlert);
    }

    public void clicarNoToast(){
        waitForElement(botaoToast);
        click(botaoToast);
    }

    public String elementoToast() throws TesseractException, IOException {
        readToastMessage = new ReadToastMessage();
        click(botaoToast);
        String result = readToastMessage.readToastMessage();
        return result;
    }

    public String getAlertText() {
         waitForElement(alertMessage);
         return getText(alertMessage);
    }



}
