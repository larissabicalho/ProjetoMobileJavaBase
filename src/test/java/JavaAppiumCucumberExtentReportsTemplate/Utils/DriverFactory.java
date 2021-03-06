package JavaAppiumCucumberExtentReportsTemplate.Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;

import static JavaAppiumCucumberExtentReportsTemplate.GlobalParameters.*;

public class DriverFactory {

    //https://github.com/extent-framework/extentreports-cucumber4-adapter/issues/48
    public static AppiumDriver<MobileElement> driver;
    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public static void inicializaDriver(boolean deviceFarm)throws IOException {
            //Se for Android e for DeviceFarm
        if (isDeviceFarm) {
            String accessKey = AccessKeyBrowserStack;
            String userName = UsernameBrowserStack;
            String buildNumber = BuildNumberBrowserStack;
            String apkUploadPath = AppAndroidUploadBrowserStack;

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("device", AndroidDeviceBrowserStack);
            caps.setCapability("os_version", AndroidOSVersionBrowserStack);
            caps.setCapability("project", AndroidProjectBrowserStack);
            caps.setCapability("build", "Android - Build [" + buildNumber + "]");
            caps.setCapability("app", "bs://" + apkUploadPath);
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("unicodeKeyboard", "true");
            caps.setCapability("resetKeyboard", "true");
            caps.setCapability("browserstack.timezone", "Sao_Paulo");
            caps.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, new ServerSocket(0).getLocalPort());
            driver = new AndroidDriver<MobileElement>(new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);
        }

        //Se for Android, n??o for DeviceFarm
        else {
            //Se for Android, n??o for DeviceFarm e for utilizar o aplicativo j?? instalado
            if (isInstalado) {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, AndroidPlatformName);
                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, AndroidPlatformVersion);
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, AndroidDeviceName);
                caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, AndroidAppPackage);
                caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, AndroidAppActivity);
                caps.setCapability(MobileCapabilityType.BROWSER_NAME, AndroidBrowserName);
                caps.setCapability(MobileCapabilityType.UDID, AndroidUDID);
                caps.setCapability(MobileCapabilityType.ORIENTATION, AndroidOrientation);

                driver = new AndroidDriver<MobileElement>(new URL(AppiumServer), caps);
            }

            //Se for Android, n??o for DeviceFarm e for utilizado um apk
            else {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, AndroidPlatformName);
                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, AndroidPlatformVersion);
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, AndroidDeviceName);
                caps.setCapability(MobileCapabilityType.APP, AndroidAppPath);
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
                caps.setCapability(MobileCapabilityType.UDID, AndroidUDID);
                caps.setCapability(MobileCapabilityType.NO_RESET, AndroidNoReset);
                caps.setCapability(MobileCapabilityType.FULL_RESET, AndroidFullReset);
                caps.setCapability(MobileCapabilityType.ORIENTATION, AndroidOrientation);

                driver = new AndroidDriver<MobileElement>(new URL(AppiumServer), caps);
            }
        }

    }


        public static void finalizaDriver(){
        driver.quit();
    }


}
