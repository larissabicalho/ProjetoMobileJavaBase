package JavaAppiumCucumberExtentReportsTemplate.Screens.Native;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import io.appium.java_client.MobileElement;
import io.cucumber.java8.Th;
import org.openqa.selenium.By;

public class ContentScrollingScreen extends PageBase {

    By menuScrolling = By.xpath("//android.widget.TextView[@text='Content Scrolling']");

    public void clicarMenuScrooling(){
        waitForElement(menuScrolling);
        click(menuScrolling);

    }

    public void scroolAteFinalDoTexto(){
        waitForElement(menuScrolling);
        scrollUsingTouchActions(33,201,447,800,5);

    }

}
