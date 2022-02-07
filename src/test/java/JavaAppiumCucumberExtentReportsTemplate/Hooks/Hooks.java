package JavaAppiumCucumberExtentReportsTemplate.Hooks;

import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import JavaAppiumCucumberExtentReportsTemplate.Utils.Utils;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Hooks {

    public static Scenario scenario;
    public static Scenario getScenario() {return scenario; }
    String screenshotdir = System.getProperty("user.dir") + "/test-output/Screenshots/";

    @Before
    public void beforMethodSetUp(Scenario _scenario) throws Throwable {
        scenario = _scenario;
        cleanDirectoryReport();
        DriverFactory.inicializaDriver(false);
    }

    @After
    public void tearDown() throws Exception {
        DriverFactory.finalizaDriver();
    }

    @AfterStep
    public void attach_screenshot() throws Throwable {
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Utils.getBase64Screenshot(DriverFactory.driver)); //for html
    }


    public void cleanDirectoryReport() throws Throwable {
        if ((new File(screenshotdir)).exists())
            FileUtils.cleanDirectory(new File(screenshotdir));
    }



}
