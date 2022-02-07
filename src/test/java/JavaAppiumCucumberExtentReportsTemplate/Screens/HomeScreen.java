package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class HomeScreen extends PageBase {

    By menuButton = By.xpath("//android.widget.ImageButton[@content-desc=\"ReferenceApp\"]");

    public void clicarMenu(){
        click(menuButton);
    }

}
