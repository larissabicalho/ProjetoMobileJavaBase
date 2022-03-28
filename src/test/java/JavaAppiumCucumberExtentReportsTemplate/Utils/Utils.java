package JavaAppiumCucumberExtentReportsTemplate.Utils;

import JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import static JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory.driver;

public class Utils {

    String screenshotdir = System.getProperty("user.dir") + "/test-output/Screenshots/";

    public static String getMethodNameByLevel(int level){
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        return stackTrace[level].getMethodName();
    }

    public static void createFolderReport(String folderName){
        File dir = new File(Utils.returnPathProject() + "\\target\\reports\\" + folderName);
        dir.mkdir();
    }
    public static String getAllStackTrace(ITestResult result){
        String allStackTrace = "";
        for(StackTraceElement stackTrace : result.getThrowable().getStackTrace()){
            allStackTrace = allStackTrace + "<br>" + stackTrace.toString();
        }
        return allStackTrace;
    }
    public static String getNowDate(String mask){
        DateFormat dateFormat = new SimpleDateFormat(mask);
        Date date = new Date();
        return dateFormat.format(date);
    }
    public static String getFileContent(String filePath) {
        BufferedReader br=null;
        StringBuilder sb=null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            br.close();
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void setContextToWebview(){
        Set<String> availableContexts = DriverFactory.getDriver().getContextHandles();
        availableContexts.stream()
                .filter(context -> context.toLowerCase().contains("webview"))
                .forEach(newcontext -> DriverFactory.getDriver().context(newcontext));
    }
    public String getDeviceDate(){
        return DriverFactory.getDriver().getDeviceTime();
    }

    public static String returnPathProject(){
        return System.getProperty("user.dir") + "\\";
    }

    public static String getBase64Screenshot(WebDriver driver) throws IOException {
        String Base64StringofScreenshot="";
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // for saving screenshots in local - this is optional
        Date oDate = new Date();
        SimpleDateFormat oSDF = new SimpleDateFormat("ddMMYYYY_HHmmss");
        String sDate = oSDF.format(oDate);
        FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "/test-output/Screenshots/" + "Screenshot_" + sDate + ".png"));
        //
        byte[] fileContent = FileUtils.readFileToByteArray(src);
        Base64StringofScreenshot = "data:image/png;base64," + Base64.getEncoder().encodeToString(fileContent);
        return Base64StringofScreenshot;
    }

    public static String getScreenshot(String name, String path){
        File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
        String filePathAndName = path + "/" +name + ".png";
        try {
            FileUtils.copyFile(scrFile, new File(filePathAndName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePathAndName;
    }

    public static String takeScreenShot() {

        String scrShotDir = "screenshots";
        File scrShotDirPath = new File(Utils.returnPathProject()+"\\"+scrShotDir+"\\");
        String destFile;

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        new File(scrShotDir).mkdirs();
        destFile = dateFormat.format(new Date()) + ".png";
        try {
            FileUtils.copyFile(scrFile, new File(scrShotDir + "/" + destFile));
        } catch (IOException e) {
            System.out.println("Image not transfered to screenshot folder");
            e.printStackTrace();
        }
        return destFile;
    }

    public static String getBase64Screenshot_AppiumDriver() throws IOException {
        String Base64StringofScreenshot="";
        File src = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
        // for saving screenshots in local - this is optional
        Date oDate = new Date();
        SimpleDateFormat oSDF = new SimpleDateFormat("ddMMYYYY_HHmmss");
        String sDate = oSDF.format(oDate);
        FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "/test-output/Screenshots/" + "Screenshot_" + sDate + ".png"));
        //
        byte[] fileContent = FileUtils.readFileToByteArray(src);
        Base64StringofScreenshot = "data:image/png;base64," + Base64.getEncoder().encodeToString(fileContent);
        return Base64StringofScreenshot;
    }

    public void cleanDirectoryReport() throws Throwable {
        if ((new File(screenshotdir)).exists())
            FileUtils.cleanDirectory(new File(screenshotdir));
    }

    public static String colocarPM(String str)
    {
        int numero = Integer.parseInt(str) + 12;
        //System.out.println(numero);
         return Integer.toString(numero);
    }


}
