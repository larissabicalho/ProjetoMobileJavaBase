package JavaAppiumCucumberExtentReportsTemplate.Screens.Native;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class ContentScrollingScreen extends PageBase {

    By menuScrolling = By.xpath("//android.widget.TextView[@text='Content Scrolling']");
    By textoScrolling = By.className("android.widget.ScrollView");

    public void clicarMenuScrooling(){
        while(!returnElementDisplayedElement(menuScrolling)){
            scrollUsingTouchActionsOnlyY(2);
        }
        click(menuScrolling);

    }

    public void scroolAteFinalDoTexto(String qtLoop){
        for(int i =0; i < Integer.parseInt(qtLoop); i ++) {
            topToBottonSwipe2();
        }
    }

    public Boolean verificarSeOTextoAparece(){
       return returnElementDisplayed(textoScrolling);
    }

}
