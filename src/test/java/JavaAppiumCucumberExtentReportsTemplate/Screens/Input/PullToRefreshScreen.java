package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class PullToRefreshScreen extends PageBase {
    By pullClick = By.id("com.amazonaws.devicefarm.android.referenceapp:id/input_refresh_display");
    By pullButton = By.xpath("//android.widget.TextView[@text='Pull To Refresh']");

    public PullToRefreshScreen(){}

    public void elementoPull(){
        while(!returnElementDisplayedElement(pullButton)){
            scrollUsingTouchActionsOnlyY(2);
        }
        click(pullButton);
    }

    public void elementoPushSwipe(){
        waitForElement(pullClick);
        topToBottonSwipe2();
    }

    public String verificarHoraAtual(){
        DateFormat dateFormat2 = new SimpleDateFormat("hh:mm");
        String dateString2 = dateFormat2.format(new Date()).toString();
        return dateString2;
    }

    public String verificarSeExisteHora(){
        waitForElement(pullClick);
        return getText(pullClick);
    }

}
