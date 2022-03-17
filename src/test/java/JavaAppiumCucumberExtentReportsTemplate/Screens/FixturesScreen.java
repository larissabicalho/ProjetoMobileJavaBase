package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class FixturesScreen extends PageBase {
    By longText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/longitude");
    By latText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/lat");
    By wifiText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/wifi");
    By bluetoothText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/bluetooth_display");
    By gpsText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/gps");
    By nfcText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/nfc");
}
