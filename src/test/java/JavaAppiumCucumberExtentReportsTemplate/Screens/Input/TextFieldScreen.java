package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class TextFieldScreen extends PageBase {

    By textField = By.id("com.amazonaws.devicefarm.android.referenceapp:id/input_edit_text");

    public void escreverTexto(String texto){
        sendKeys(textField, texto);
    }

    public String verificarSeEstaEscrito(){
       return getText(textField);
    }

}
