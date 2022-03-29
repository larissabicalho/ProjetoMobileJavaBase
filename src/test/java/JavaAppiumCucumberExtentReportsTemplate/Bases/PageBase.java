package JavaAppiumCucumberExtentReportsTemplate.Bases;


import com.google.common.collect.ImmutableMap;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory.getDriver;
import static java.time.Duration.ofMillis;
import static java.util.Collections.singletonList;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

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
    protected void waitForElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(elementToBeClickable(element));
    }

    protected void scrollUsingTouchActions(int seconds) {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width/2);

        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.20);
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(startx, starty))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(seconds)))// Start at 100,100
                .moveTo(PointOption.point(startx,endy)).release().perform(); // Passing absolute values of 200,200 ending up at 200,200
    }

    protected void scrollUsingTouchActionsOnlyY(int seconds) {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.height/4);

        int starty = (int) (size.width * 0.98);
        int endy = (int) (size.width * 0.10);
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(starty, startx))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(seconds)))// Start at 100,100
                .moveTo(PointOption.point(endy,startx)).release().perform(); // Passing absolute values of 200,200 ending up at 200,200
    }

    public void esconderTeclado(){
        getDriver().hideKeyboard();
    }


    public void timePicker(String numero1, String numero2) {
        waitForElement(driver.findElementByAccessibilityId(numero1));
        driver.findElementByAccessibilityId(numero1).click();
        waitForElement(driver.findElementByAccessibilityId(numero2));
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

    public void topToBottonSwipe() {
        Dimension dim= driver.manage().window().getSize();
        int height=(int) dim.getHeight();
        int width=(int) dim.getWidth();
        int x= width/2;
        int startY=(int) (height*0.80);
        int endY=(int) (height*0.20);

        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(x,startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(x,endY)).release().perform();
    }

    public void topToBottonSwipe2() {
        Dimension dim = driver.manage().window().getSize();
        int height=(int) dim.getHeight();
        int width=(int) dim.getWidth();
        int x= width/2;
        int y = height/2;
        int bottomEdge = (int) (height * 0.85f);
        new TouchAction(driver)
                .press(PointOption.point(x, y))
                .waitAction(WaitOptions.waitOptions(ofMillis(1000)))
                .moveTo(PointOption.point(x, bottomEdge))
                .release()
                .perform();
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

        WaitOptions waitOptions = new WaitOptions().withDuration(ofMillis(500));

        //Ação
        TouchAction actions = new TouchAction(driver);
        actions.press(startPointOption).waitAction(waitOptions).moveTo(endPointOption).waitAction().release().perform();
    }



    ///TOP, RIGHT, BOTTOM e LEFT
    public void swipeElementWithDirection2(By locator, String direction) {

        MobileElement element = waitForElement(locator);

        String action = "";
        double endXPercen = 0.09;
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

        WaitOptions waitOptions = new WaitOptions().withDuration(ofMillis(500));

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
        wait.until(elementToBeClickable(element));

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


    protected boolean returnElementDisplayedElement(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (Exception e){
            return false;
        }
    }


    protected MobileElement waitForElementBeVisible(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        MobileElement element = (MobileElement) driver.findElement(locator);

        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void longPress(By gesture) {
            waitForElement(gesture);
            MobileElement element = (MobileElement) driver.findElement(gesture);
            TouchAction actions = new TouchAction(driver);
            actions.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element)));
            actions.perform();
    }



    protected void tap(By gesture){
        waitForElement(gesture);
        MobileElement element = (MobileElement) driver.findElement(gesture);
        TouchAction actions = new TouchAction(driver);
        actions.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)));
        actions.perform();
    }




    public  void doubleTap2() throws InterruptedException {
        MobileElement element = (MobileElement) new WebDriverWait(driver, 30).
                until(elementToBeClickable(MobileBy.AccessibilityId("Gesture Action Pad")));
        Thread.sleep(1000);
        Point source = element.getCenter();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(ofMillis(0),
                PointerInput.Origin.viewport(), source.x, source.y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, ofMillis(200)));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, ofMillis(40)));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, ofMillis(200)));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(singletonList(tap));
        Thread.sleep(4000);
    }


    protected void scrollUsingTouchActionsPoint(int startX,int startY, int endX, int endY, int seconds) {
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(startX,startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(seconds)))
                .moveTo(PointOption.point(endX,endY)).release().perform();
    }


    protected void scrollUsingTouchActions(MobileElement gestureField, MobileElement gestureField2) {

        Coordinates points = gestureField.getCoordinates();
        Coordinates points2 = gestureField2.getCoordinates();
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(points.onPage().getX(),points.onPage().getY()))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(points2.onPage().getX(),points2.onPage().getY())).release().perform();
    }

   public void scrollTexto(By gesture)
{
    waitForElement(gesture);
    MobileElement element = (MobileElement) driver.findElement(gesture);
    int x = element.getCenter().x;
    int y = element.getCenter().y;
    scrollUsingTouchActionsPoint(x,y,x ,y/2,2);

}

    public void scrollTextoScrool(By gesture)
    {
        waitForElement(gesture);
        MobileElement element = (MobileElement) driver.findElement(gesture);
        int x = element.getCenter().x;
        int y = element.getCenter().y;
        scrollUsingTouchActionsPoint(x,y,x/2 ,y,1);

    }

    public Object executarComandoAdb(String command, List<String> args) {
        Map<String, Object> params = ImmutableMap.of("command", command, "args", args);
        return driver.executeScript("mobile: shell", params);
    }

    public boolean validarComando() {
        String command = "am start -a android.bluetooth.adapter.action.REQUEST_ENABLE";
        List<String> args = Arrays.asList(
                "");
        Object o  = "";
        o = executarComandoAdb(command, args);
        new Actions(driver).pause(1000).perform();

        return o.toString().split("\r\n").length > 0;

    }

    public boolean validarComandoExecutar() {
        String command = "am start -a android.bluetooth.adapter.action.REQUEST_DISABLE";
        List<String> args = Arrays.asList(
                "");
        Object o  = "";
        o = executarComandoAdb(command, args);
        new Actions(driver).pause(1000).perform();

        return o.toString().split("\r\n").length > 0;

    }
}//fim classe
