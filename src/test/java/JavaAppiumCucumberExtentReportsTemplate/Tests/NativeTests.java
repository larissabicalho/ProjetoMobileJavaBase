package JavaAppiumCucumberExtentReportsTemplate.Tests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
        features = "src/test/resources/features/Native.feature",
        glue = {"JavaAppiumCucumberExtentReportsTemplate/StepDefinitions/","JavaAppiumCucumberExtentReportsTemplate.Hooks"}

)
public class NativeTests extends AbstractTestNGCucumberTests {

}