package JavaAppiumCucumberExtentReportsTemplate.Screens.Native;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class VideoPlayerScreen extends PageBase {

    By menuVideo = By.xpath("//android.widget.TextView[@text='Video Player']");
    By videoAparecendo = By.id("com.amazonaws.devicefarm.android.referenceapp:id/native_video_player");

    public void clicarMenuVideo(){
        while(!returnElementDisplayedElement(menuVideo)){
            scrollUsingTouchActionsOnlyY(2);
        }
        click(menuVideo);

    }

    public boolean verificarSeOElementoExiste(){
        return returnElementDisplayed(videoAparecendo);
    }


}
