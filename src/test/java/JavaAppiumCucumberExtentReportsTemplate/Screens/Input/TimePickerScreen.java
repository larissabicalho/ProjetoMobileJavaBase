package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import JavaAppiumCucumberExtentReportsTemplate.Utils.Utils;
import org.openqa.selenium.By;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimePickerScreen extends PageBase {
    By timeClick = By.xpath("//android.widget.TextView[@text='Time Picker']");
    By verificarHorario = By.xpath("//android.widget.TextView[@content-desc='Timepicker Display']");
    String colocarTurno = "//android.widget.RadioButton[@text='###']";

    public void elementoTime(){
        while(!returnElementDisplayedElement(timeClick)){
            scrollUsingTouchActionsOnlyY(2);
        }
        click(timeClick);
    }

    public void timePickerTipo(String numero1, String numero2) {
        timePicker(numero1, numero2);
    }

    public void clicarSeAMPM(String turno){
         colocarTurno = colocarTurno.replace("###",turno);
         waitForElement(By.xpath(colocarTurno));
         click(By.xpath(colocarTurno));
    }

    public boolean verificarTempo(String numero1, String numero2, String turno) throws ParseException {
        String data = null;
        if (turno.equals("AM")) {
            if(numero1.equals("12")) {
               numero1 = numero1.replace("12","0");
            }
            System.out.println(numero1);
            data = numero1.concat(" ").concat(":").concat(" ").concat(numero2);
        } else {
            if(!numero1.equals("12")) {
                numero1 = Utils.colocarPM(numero1);
            }
            data = numero1.concat(" ").concat(":").concat(" ").concat(numero2);
        }
        waitForElement(verificarHorario);
        return getText(verificarHorario).equals(data);
    }
}
