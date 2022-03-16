package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class InputControlsScreen  extends PageBase {
    By checkBoxClick = By.xpath("//android.widget.TextView[@text='Checkbox']");
    By checkBoxButton = By.xpath("//android.widget.Checkbox[@text='Checkbox']");
    By validarCheckBox = By.xpath("//android.widget.TextView[@content-desc='Checkbox Display']");
    By radioClick = By.xpath("//android.widget.TextView[@text='Radio Buttom']");
    By radioButtonWeb = By.xpath("//android.widget.RadioButton[@content-desc='Radio Button 2']");
    By verificarWeb = By.xpath("//android.widget.TextView[@content-desc='Radio Button Display']");
    By toggleClick = By.xpath("//android.widget.TextView[@text='Toggle Button']");
    By toggleButton = By.id("com.amazonaws.devicefarm.android.referenceapp:id/input_switch");
    By verificarSeToggleTaOn = By.xpath("//android.widget.FrameLayout[@content-desc='ON']");
    By spinnerClick = By.xpath("//android.widget.Spinner[@content-desc='Spinner Control']");
    String spinnerOption = "//android.widget.TextView[@text='###']";
    By verificarOption = By.xpath("//android.widget.TextView[@content-desc='Spinner Display']");
    By timeClick = By.xpath("//android.widget.TextView[@text='Time Picker']");
    By dateClick = By.xpath("//android.widget.TextView[@text='Date Picker']");
    By verificarDate = By.xpath("//android.widget.TextView[@content-desc='Datepicker Display']");
    By submitClick = By.xpath("//android.widget.TextView[@text='Submit Button']");
    By gesturesClick = By.xpath("//android.widget.TextView[@text='Gestures']");


    public void elementoCheckbox(){
        swipeElementWithDirection(checkBoxClick,"RIGHT");
        click(checkBoxButton);
    }

    public void elementoRadio(){
        swipeElementWithDirection(radioClick,"RIGHT");
        click(radioClick);
    }

    public void radioClickWeb(){
        waitForElement(radioButtonWeb);
        click(radioButtonWeb);
    }

    public String verificarRadioWeb(){
       return getText(verificarWeb);
    }

    public void elementoToggle(){
        swipeElementWithDirection(toggleClick,"RIGHT");
        click(toggleClick);
    }

    public void clicarElementoToggle(){
        waitForElement(toggleButton);
        click(toggleButton);
    }

    public Boolean verificarToggle(){
        waitForElement(verificarSeToggleTaOn);
        return returnElementDisplayed(verificarSeToggleTaOn);
    }
    public void elementoSpinner(){
        swipeElementWithDirection(spinnerClick,"RIGHT");
        click(spinnerClick);
    }

    public void clicarNoSpinner(String option)
    {
        spinnerOption = spinnerOption.replace("###",option);
        click(By.xpath(spinnerOption));
    }

    public void timePickerTipo(String numero1, String numero2) {
        timePicker(numero1, numero2);
    }
    public String verificarSpinner(){
        waitForElement(verificarOption);
        return getText(verificarOption);
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

    public void elementoSubmit(){
        swipeElementWithDirection(submitClick,"RIGHT");
        click(submitClick);
    }

    public void elementoGestures(){
        swipeElementWithDirection(gesturesClick,"RIGHT");
        click(gesturesClick);
    }


    public void elementoTime(){
        swipeElementWithDirection(timeClick,"RIGHT");
        click(timeClick);
    }

    public void elemento(){
        click(checkBoxButton);
    }

    public String verificarTextoCheckbox(){
        return getText(validarCheckBox);
    }
}
