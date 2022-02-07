package JavaAppiumCucumberExtentReportsTemplate.Bases;

import JavaAppiumCucumberExtentReportsTemplate.Hooks.Hooks;
import JavaAppiumCucumberExtentReportsTemplate.Utils.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {

    private AppiumDriver driver = null;
    private WebDriverWait wait = null;

    public PageBase(){
        driver = DriverFactory.getDriver();
        wait = new WebDriverWait (driver, 90);
    } //fim construtor

    //mobile elements
    protected void waitForElement(MobileElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
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
        double endXPercen = 0.9;
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

    protected void sendKeys(By locator, String text){
        waitForElement(locator).sendKeys(text);
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