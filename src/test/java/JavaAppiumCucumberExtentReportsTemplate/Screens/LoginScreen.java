package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class LoginScreen extends PageBase {

    By usernameInput = By.id("com.amazonaws.devicefarm.android.referenceapp:id/username_text_input");

    By passwordInput = By.id("com.amazonaws.devicefarm.android.referenceapp:id/password_text_input");

    By loginButton = By.id("com.amazonaws.devicefarm.android.referenceapp:id/login_button");

    By wrongLoginMessage = By.id("com.amazonaws.devicefarm.android.referenceapp:id/login_alt_message_textView");


    public void fillRandomUsername(){
        String username = "username " + Math.random();
        sendKeys(usernameInput, username);
    }

    public void fillRandomPasword(){
        String password = "passwordInput " + Math.random();
        sendKeys(passwordInput, password);
    }

    public void clickLoginButton(){
        click(loginButton);
    }

    public String returnWrongLoginMessage(){
        return getText(wrongLoginMessage);
    }


}
