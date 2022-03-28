package JavaAppiumCucumberExtentReportsTemplate.Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.URL;

public class DriverFactory {

    //https://github.com/extent-framework/extentreports-cucumber4-adapter/issues/48
    public static AppiumDriver<MobileElement> driver;
    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public static void inicializaDriver(boolean deviceFarm)throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();

        if(deviceFarm){
            String userName = "saymon3";
            String accessKey = "CwULAq5EsNiyhZaKHRwy";
            caps.setCapability("device", "Google Pixel 3");
            caps.setCapability("os_version", "9.0");
            caps.setCapability("project", "My First Project");
            caps.setCapability("build", "My First Build");
            caps.setCapability("name", "Bstack-[Java] Sample Test");
            caps.setCapability("app", "bs://74be7c6c9986e2772d06c0464842f28d702b6290");

            driver = new AndroidDriver<MobileElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
        }
        else {
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "9.0");
            caps.setCapability("deviceName", "Pixel_2_API_28");
            caps.setCapability("app", System.getProperty("user.dir") + "\\src\\test\\resources\\app\\appSample.apk");

            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        }
    }

    public static void finalizaDriver(){
        driver.quit();
    }


}
