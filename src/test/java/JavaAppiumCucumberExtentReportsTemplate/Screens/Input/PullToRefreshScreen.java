package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class PullToRefreshScreen extends PageBase {
    By pullClick = By.id("com.amazonaws.devicefarm.android.referenceapp:id/input_refresh_display");
    By pullButton = By.xpath("//android.widget.TextView[@text='Pull To Refresh']");

    public void elementoPull(){
        while(!returnElementDisplayedElement(pullButton)){
            scrollUsingTouchActionsOnlyY(2);
        }
        click(pullButton);
    }

    public void elementoPushSwipe(){
     //   swipeElementWithDirection2(pullClick,"DOWN");
     //   waitForElement(pullButton);
        waitForElement(pullClick);
        topToBottonSwipe2();
    }

    public String verificarHoraAtual(){
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat broken = new SimpleDateFormat("hh:mm");
        return broken.format(date);
    }

    public boolean verificarSeExisteHora(){
        String textoNaTela =  getText(pullClick);
        textoNaTela = textoNaTela.substring(0,5);
     //   System.out.println(textoNaTela);
       // System.out.println(verificarHoraAtual());
        boolean x =  textoNaTela.contains(verificarHoraAtual());
    //    System.out.println(x);
        return x;
    }

}
