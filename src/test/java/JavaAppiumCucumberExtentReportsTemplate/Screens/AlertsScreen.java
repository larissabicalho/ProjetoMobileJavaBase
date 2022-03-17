package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class AlertsScreen extends PageBase {
    By botaoToast = By.id("com.amazonaws.devicefarm.android.referenceapp:id/notifications_toast_button");
    By botaoAlert = By.id("com.amazonaws.devicefarm.android.referenceapp:id/notifications_alert_button");
}
