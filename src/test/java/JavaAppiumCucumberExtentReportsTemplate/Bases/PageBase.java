package JavaAppiumCucumberExtentReportsTemplate.Bases;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;

import static JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory.getDriver;

public class PageBase {

    private AppiumDriver driver = null;
    private WebDriverWait wait = null;
    protected JavascriptExecutor javaScriptExecutor = null;

    public PageBase(){
        driver = getDriver();
        wait = new WebDriverWait (driver, 90);
        javaScriptExecutor = (JavascriptExecutor)driver;
    } //fim construtor

    //mobile elements
    protected void waitForElement(MobileElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void scrollUsingTouchActions(int startX,int startY, int endX, int endY, int seconds) {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width/2);
        int endx = (int) (size.width);

        int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.10);
        System.out.println(starty);
        System.out.println(endy);
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(startx, starty))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(seconds)))// Start at 100,100
                .moveTo(PointOption.point(endx,endy)).release().perform(); // Passing absolute values of 200,200 ending up at 200,200

       // action.press(x, y).moveTo(x, y).release().perform()
    //    actions.press(PointOption.point(startX,startY))
      //          .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(seconds)))
        //        .moveTo(PointOption.point(endX,endY)).release().perform();*/
    }

    protected void finalContentScrolling(String elementText){
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                        ".setSwipeDeadZonePercentage(50).scrollIntoView(new UiSelector()" +
                        ".textMatches(\"" + elementText + "\").instance(0))"));
    }

    public void esconderTeclado(){
        getDriver().hideKeyboard();
    }


    public void clickNoSpinner(String visibleText) {

        String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Progress Bar\").instance(0))";

        driver.findElement(MobileBy.AndroidUIAutomator(scrollElement)).click();
    }

    public void selectDate(String mudarData) {
        //09 março 2022
        driver.findElementByAccessibilityId(mudarData);
    }

    public void timePicker(String numero1, String numero2) {
        driver.findElementByAccessibilityId(numero1).click();
        driver.findElementByAccessibilityId(numero2).click();
    }
    protected void click(MobileElement element){
        waitForElement(element);
        element.click();
    }


    protected void sendKeys(MobileElement element, String text){
        waitForElement(element);
        element.sendKeys(text);
    }

    protected String getText(MobileElement element){
        waitForElement(element);
        String text = element.getText();
        return text;
    }

    ///TOP, RIGHT, BOTTOM e LEFT
    public void swipeElementWithDirection(By locator, String direction) {

        MobileElement element = waitForElement(locator);

        String action = "";
        double endXPercen = 0.025;
        int startX, startY, endX, endY;

        //Coleta a largura da tela
        int screenWidth = driver.manage().window().getSize().width;

        //Coleta a altura da tela
        int screenHeight = driver.manage().window().getSize().height;

        switch (direction) {
            case "TOP":
                //Coleta o centro eixo x do elemento
                startX = element.getCenter().getX();
                //Coleta a altura do elemento
                startY = element.getSize().getHeight();

                endX = startX;

                //Calculo do limite do eixo Y (altura - percentil de altura aceitavel)
                endY = screenHeight - (int) (screenHeight * endXPercen);
                action = "TOP";
                break;

            case "RIGHT":
                //Coleta o centro eixo x do elemento
                startX = element.getCenter().getX();
                //Coleta a altura do elemento
                startY = element.getCenter().getY();

                //Calcula o ponto final do eixo X: baseando-se na largura da tela x percentil
                endX = (int) (screenWidth * endXPercen);
                endY = startY;
                action = "RIGHT";
                break;

            case "LEFT":
                //Coleta o centro eixo x do elemento
                startX = element.getSize().getWidth();
                //Coleta a altura do elemento
                startY = element.getCenter().getY();

                //Calcula o ponto final do eixo X: largura - percentil do elemento
                endX = screenWidth - (int) (screenWidth * endXPercen);
                endY = startY;
                action = "LEFT";
                break;

            default:
                //Coleta o centro eixo x do elemento
                startX = element.getCenter().getX();
                //Coleta a altura do elemento
                startY = element.getLocation().getY();

                endX = startX;

                //Calcula o ponto final do eixo X: baseando-se na altura da tela x percentil
                endY = (int) (screenHeight * endXPercen);
                action = "DOWN";
                break;
        }

        //Ponto de inicio
        Point startPoint = new Point(startX, startY);
        PointOption startPointOption = new PointOption().withCoordinates(startPoint);

        //Ponto de final
        Point endPoint = new Point(endX, endY);
        PointOption endPointOption = new PointOption().withCoordinates(endPoint);

        WaitOptions waitOptions = new WaitOptions().withDuration(Duration.ofMillis(500));

        //Ação
        TouchAction actions = new TouchAction(driver);
        actions.press(startPointOption).waitAction(waitOptions).moveTo(endPointOption).waitAction().release().perform();
    }

    //By locator

    protected void waitForBy(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected MobileElement waitForElement(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        MobileElement element = (MobileElement) driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));

        return element;
    }

    protected void click(By locator){
        waitForElement(locator).click();
    }

    protected void clear(By locator){
        waitForElement(locator).clear();
    }

    protected void sendKeys(By locator, String text){
        waitForElement(locator).sendKeys(text);
    }

    protected  void clicarEmEnter() {
        ((AndroidDriver)driver).getKeyboard().pressKey(Keys.ENTER);
    }
    protected String getText(By locator){
        String text = waitForElement(locator).getText();
        return text;
    }

    protected boolean returnElementDisplayed(By locator){
        return waitForElementBeVisible(locator).isDisplayed();
    }

    protected MobileElement waitForElementBeVisible(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        MobileElement element = (MobileElement) driver.findElement(locator);

        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }



}//fim classe
