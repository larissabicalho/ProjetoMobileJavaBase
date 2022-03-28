package JavaAppiumCucumberExtentReportsTemplate.Screens.Native;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class CameraScreen extends PageBase {

    By menuCamera = By.xpath("//android.widget.TextView[@text='Camera']");
    By cameraAparecendo = By.id("com.amazonaws.devicefarm.android.referenceapp:id/camera_surface_view");

    public void clicarMenuCamera(){
        while(!returnElementDisplayedElement(menuCamera)){
            scrollUsingTouchActionsOnlyY(2);
        }
        click(menuCamera);

    }

    public boolean verificarSeOElementoExiste(){
        return returnElementDisplayed(cameraAparecendo);
    }

}
