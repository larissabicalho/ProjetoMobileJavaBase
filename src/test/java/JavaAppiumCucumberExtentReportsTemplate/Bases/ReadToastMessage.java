package JavaAppiumCucumberExtentReportsTemplate.Bases;

import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import JavaAppiumCucumberExtentReportsTemplate.Utils.Utils;
import io.appium.java_client.AppiumDriver;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.bytedeco.javacpp.*;

import static JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks.getScenario;
import static org.bytedeco.javacpp.lept.*;
import static org.bytedeco.javacpp.tesseract.*;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadToastMessage extends PageBase {

    private AppiumDriver driver = null;
    private WebDriverWait wait = null;

    public ReadToastMessage(){
        driver = DriverFactory.getDriver();
        wait = new WebDriverWait (driver, 90);
    } //

    public String readToastMessage() throws TesseractException, IOException {
        String scrShotDir = "screenshots";
        File scrShotDirPath = new java.io.File("./"+ scrShotDir+ "//");

        String imgName =  Utils.takeScreenShot();
        String result = null;
        File imageFile = new File(scrShotDirPath, imgName);
        ITesseract instance = new Tesseract();

        File tessDataFolder = LoadLibs.extractTessResources("tessdata");
        instance.setDatapath(tessDataFolder.getAbsolutePath());
        result = instance.doOCR(imageFile);
        return result;
    }



}