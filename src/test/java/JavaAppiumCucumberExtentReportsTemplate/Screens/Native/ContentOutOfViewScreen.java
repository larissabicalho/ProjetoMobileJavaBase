package JavaAppiumCucumberExtentReportsTemplate.Screens.Native;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class ContentOutOfViewScreen extends PageBase {
    By menuContent = By.xpath("//android.widget.TextView[@text='Content Out of View']");
    By menuContentScroll = By.xpath("//android.widget.TextView[@text='Content Scrolling']");
    By hiddenText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/hidden_text");
    By itemCentralMenu =  By.xpath("//*[@class = 'android.widget.TextView'][2]");

    public ContentOutOfViewScreen(){}

    public void swipe(String nomeMenuDesejado) {
        String menuObtido;
        boolean checkBoxExiste;
        if (nomeMenuDesejado.equals("Content Scrolling"))
        {
            do {
                scrollUsingTouchActionsOnlyY(2);
                checkBoxExiste = returnIfElementExists(menuContentScroll);
            } while (!checkBoxExiste);
        }
        else {
            do {
                scrollUsingTouchActionsOnlyY(2);
                //pega o texto do menu central
                menuObtido = getText(itemCentralMenu);
            } while (!menuObtido.equals(nomeMenuDesejado));
        }
    }

    public void clicarMenuContent(){
        swipe("Content Out of View");
        click(menuContent);

    }

    public void scroolAteHidden(){
        topToBottonSwipe();
        topToBottonSwipe();
    }

    public String verificarSeOTextoAparecendo(){
        scroolAteHidden();
        waitForElementBeVisible(hiddenText);
        return getText(hiddenText);
    }


}
