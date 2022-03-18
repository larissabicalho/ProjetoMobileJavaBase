package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import JavaAppiumCucumberExtentReportsTemplate.Bases.ReadToastMessage;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;

import java.io.IOException;

public class InputControlsScreen  extends PageBase {


    By timeClick = By.xpath("//android.widget.TextView[@text='Time Picker']");
    By dateClick = By.xpath("//android.widget.TextView[@text='Date Picker']");
    By verificarDate = By.xpath("//android.widget.TextView[@content-desc='Datepicker Display']");
    By submitClick = By.xpath("//android.widget.TextView[@text='Submit Button']");
    By gesturesClick = By.xpath("//android.widget.TextView[@text='Gestures']");

    ReadToastMessage readToastMessage;








    public void timePickerTipo(String numero1, String numero2) {
        timePicker(numero1, numero2);
    }

    public void elementoDate(){
        swipeElementWithDirection(dateClick,"RIGHT");
        click(dateClick);
    }

    public void clicarDate(String data){
        selectDate(data);
    }

    public String verificarData(){
       return getText(verificarDate);
    }

    public String elementoSubmit() throws TesseractException, IOException {
        swipeElementWithDirection(submitClick,"RIGHT");
        readToastMessage = new ReadToastMessage();
        click(submitClick);
        String result = readToastMessage.readToastMessage();
            return result;
    }

    public void elementoGestures(){
        swipeElementWithDirection(gesturesClick,"RIGHT");
        click(gesturesClick);
    }


    public void elementoTime(){
        swipeElementWithDirection(timeClick,"RIGHT");
        click(timeClick);
    }


}
