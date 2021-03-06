package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class FixturesScreen extends PageBase {
    By longText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/longitude");
    By latText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/lat");
    By wifiText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/wifi");
    By bluetoothText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/bluetooth");
    By gpsText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/gps");
    By nfcText = By.id("com.amazonaws.devicefarm.android.referenceapp:id/nfc");
    By clicarPermitir = By.id("android:id/button1");

    private static final String BOOLEAN_SELECTOR = "true|false";

    public FixturesScreen(){}

    public String statusLong() {
        return getText(longText);
    }

    public String statusLat() {
        return getText(latText);
    }

    public String statusWifi() {
        return getText(wifiText);
    }

    public String statusBlu() {
        return getText(bluetoothText);
    }

    public String statusGPS() {
        return getText(gpsText);
    }

    public String statusNFC(){
        return getText(nfcText);
    }

    public void verificarLong(){
        Assert.assertFalse(statusLong().matches(BOOLEAN_SELECTOR));
    }

    public void verificarLat(){
        Assert.assertFalse(statusLat().matches(BOOLEAN_SELECTOR));
    }

    public void verificarWifi(){
        Assert.assertTrue(statusWifi().matches(BOOLEAN_SELECTOR));
    }

    public void verificarBluTrue(){
        String status = statusBlu();
        validarComandoExecutar();
        click(clicarPermitir);
        Assert.assertTrue(status.matches(BOOLEAN_SELECTOR));
    }

    public void verificarBluFalse(){
        Assert.assertTrue(statusBlu().matches(BOOLEAN_SELECTOR));
    }


    public void verificarGPS(){
        scrollTexto(bluetoothText);
        Assert.assertTrue(statusGPS().matches(BOOLEAN_SELECTOR));
    }
    public void verificarNFC(){
        scrollTexto(bluetoothText);
        Assert.assertTrue(statusNFC().matches(BOOLEAN_SELECTOR));
    }

}
