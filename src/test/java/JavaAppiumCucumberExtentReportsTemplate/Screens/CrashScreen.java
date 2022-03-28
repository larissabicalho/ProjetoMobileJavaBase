package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class CrashScreen extends PageBase {

    By botaoCrash = By.id("com.amazonaws.devicefarm.android.referenceapp:id/crash_button");

    public boolean verificarNoCrash(){
        return returnElementDisplayed(botaoCrash);
    }
}
