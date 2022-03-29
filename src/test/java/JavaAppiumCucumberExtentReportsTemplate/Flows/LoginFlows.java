package JavaAppiumCucumberExtentReportsTemplate.Flows;


import JavaAppiumCucumberExtentReportsTemplate.Screens.LoginScreen;


public class LoginFlows {
    //Objects and constructor
    LoginScreen loginScreen;

    public LoginFlows(){
        loginScreen = new LoginScreen();
    }

    //Flows
    public void efetuarLogin(String username, String password){
        loginScreen.preencherUsuario(username);
        loginScreen.preencherSenha(password);
        loginScreen.clicarEmLogin();
    }
}