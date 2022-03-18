package JavaAppiumCucumberExtentReportsTemplate.Screens.Input;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class PullToRefresh extends PageBase {
    By pullClick = By.id("com.amazonaws.devicefarm.android.referenceapp:id/input_refresh_display");
    By pullButton = By.xpath("//android.widget.TextView[@text=' Pull To Refresh']");
}
