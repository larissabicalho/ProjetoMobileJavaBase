package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class GesturesScreen extends PageBase {
    By gesturesClick = By.xpath("//android.widget.TextView[@text='Gestures']");
    By gesturesButton = By.id("com.amazonaws.devicefarm.android.referenceapp:id/input_gesture_action_pad");
    By visualizarTexto = By.id("com.amazonaws.devicefarm.android.referenceapp:id/input_gesture_content");

    public void elementoGestures(){
        while(!returnElementDisplayedElement(gesturesClick)){
                scrollUsingTouchActionsOnlyY(2);
            }
        click(gesturesClick);
    }
    public void longPresGestures(){
        longPress(gesturesButton);
    }

    public void tapGestures(){
         tap(gesturesButton);
    }

    public void doubleTapGestures() throws InterruptedException {
        doubleTap2();
    }

    public void flyGestures(){
        scrollTexto(gesturesButton);
    }

    public void scrollGestures(){
        scrollTextoScrool(gesturesButton);
    }

    public String getAction(){
        MobileElement texto = waitForElement(visualizarTexto);
        String[] entries = texto.getText().split("\n");
        return entries[entries.length - 1];
    }

}
