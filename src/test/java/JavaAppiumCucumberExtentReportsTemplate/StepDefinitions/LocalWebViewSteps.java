package JavaAppiumCucumberExtentReportsTemplate.StepDefinitions;

import JavaAppiumCucumberExtentReportsTemplate.Screens.LocalWebViewScreen;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class LocalWebViewSteps {
    LocalWebViewScreen localWebViewScreen;

    @And("verificar texto Principal")
    public void verificarTextoPrincipal() {
        localWebViewScreen = new LocalWebViewScreen();
        Assert.assertEquals(localWebViewScreen.verificarTexto(),"Hello! Seattle Washington");
    }

    @And("preencher nome (.*)")
    public void preencherName(String name) {
        localWebViewScreen = new LocalWebViewScreen();
        localWebViewScreen.preencherName(name);
    }

    @And("preencher lastName (.*)")
    public void preencherLastName(String lastName) {
        localWebViewScreen = new LocalWebViewScreen();
        localWebViewScreen.preencherLastName(lastName);
    }

    @And("verificar texto con nome (.*) e lastName (.*)")
    public void verificarTexto(String name, String lastName) {
        localWebViewScreen = new LocalWebViewScreen();
        Assert.assertEquals(localWebViewScreen.verificarTexto(),"Hello! "+name+" "+lastName+"");
    }
}
