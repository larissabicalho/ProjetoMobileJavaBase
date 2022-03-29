package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class LoginScreen extends PageBase {

    By usernameField = By.id("com.amazonaws.devicefarm.android.referenceapp:id/username_text_input");
    By passwordField = By.id("com.amazonaws.devicefarm.android.referenceapp:id/password_text_input");
    By loginButton = By.id("com.amazonaws.devicefarm.android.referenceapp:id/login_button");
    By verificarLogin = By.id("com.amazonaws.devicefarm.android.referenceapp:id/login_alt_message_textView");
    By clicarLogout = By.id("com.amazonaws.devicefarm.android.referenceapp:id/alt_button");
    By clicarTryButton = By.id("com.amazonaws.devicefarm.android.referenceapp:id/alt_button");

    //Actions
    public void preencherUsuario(String usuario) {
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha) {
        sendKeys(passwordField, senha);
    }

    public void clicarEmLogin() {
        click(loginButton);
    }

    public String verificarMessageLogin() {
        return getText(verificarLogin);
    }

    public void clicarEmLogout() {
        click(clicarLogout);
    }

    public boolean verificarSeVoltouParaInicial() {
        return returnElementDisplayed(usernameField);
    }

    public void clicarTryButton(){
        click(clicarTryButton);
    }

}
