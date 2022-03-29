package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class LocalWebViewScreen extends PageBase {
    By primeiroName = By.xpath("//android.widget.EditText[1]");
    By lastName = By.xpath("//android.widget.EditText[2]");
    By textoEscrito = By.xpath("(//android.view.View)[3]");

    public String verificarTexto(){
        return getText(textoEscrito);
    }

    public void preencherName(String name){
        clear(primeiroName);
        sendKeys(primeiroName, name);
        esconderTeclado();
    }

    public void preencherLastName(String lastNameTexto){
        clear(lastName);
        sendKeys(lastName,lastNameTexto);
        esconderTeclado();
    }





}
