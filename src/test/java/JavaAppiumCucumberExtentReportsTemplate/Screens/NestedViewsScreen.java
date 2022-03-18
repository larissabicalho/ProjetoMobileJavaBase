package JavaAppiumCucumberExtentReportsTemplate.Screens;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class NestedViewsScreen extends PageBase {

    By backButton = By.xpath("//android.widget.ImageButton[@content-desc='Navegar para cima']");
    By textoAcima = By.id("com.amazonaws.devicefarm.android.referenceapp:id/up_navigation_content_text");
    By upButton = By.id("com.amazonaws.devicefarm.android.referenceapp:id/nested_up_button");
    By nextLevelButton = By.id("com.amazonaws.devicefarm.android.referenceapp:id/nested_up_button");
    By backNavigationButton = By.id("com.amazonaws.devicefarm.android.referenceapp:id/nested_back_button");
    By nextLevelBackButton = By.id("com.amazonaws.devicefarm.android.referenceapp:id/back_navigation_next_button");
    By contadorLevel = By.id("com.amazonaws.devicefarm.android.referenceapp:id/back_navigation_next_button");


}
