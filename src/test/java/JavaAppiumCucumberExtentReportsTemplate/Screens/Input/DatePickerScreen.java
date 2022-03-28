package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class DatePickerScreen extends PageBase {
    By dateClick = By.xpath("//android.widget.TextView[@text='Date Picker']");
    By procurarAData = By.id("android:id/date_picker_header_year");
    By procurar1995 = By.xpath("//android.widget.TextView[@text='1995']");
    By clicar1995 = By.xpath("//android.widget.TextView[@text='1995']");
    By trocarOMes = By.id("android:id/next");
    By verificarData = By.xpath("//android.widget.TextView[@content-desc='Datepicker Display']");
    String diaDoMes = "//android.view.View[@text='###']";


    public void elementoDate(){
        while(!returnElementDisplayedElement(dateClick)){
            scrollUsingTouchActionsOnlyY(2);
        }
        click(dateClick);
    }

    public void procurarAData(){
        click(procurarAData);
        waitForElement(procurar1995);
        click(clicar1995);
    }

    public void procurarOMes(){
        waitForElement(trocarOMes);
        click(trocarOMes);
    }

    public void trocarODia(String dia) {
       diaDoMes = diaDoMes.replace("###", dia);
       waitForElement(By.xpath(diaDoMes));
       click(By.xpath(diaDoMes));
    }

    public boolean verificarAno(){
        return getText(verificarData).contains("1995");
    }


}
