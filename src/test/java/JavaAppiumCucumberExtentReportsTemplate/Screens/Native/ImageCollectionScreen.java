package JavaAppiumCucumberExtentReportsTemplate.Screens.Native;

import JavaAppiumCucumberExtentReportsTemplate.Bases.PageBase;
import org.openqa.selenium.By;

public class ImageCollectionScreen extends PageBase {

        By verificarGaleria = By.id("com.amazonaws.devicefarm.android.referenceapp:id/native_image_grid_view");
        By verificarGrid = By.xpath("(//android.widget.ImageView)[3]");
        By verificarGrid2 = By.xpath("(//android.widget.ImageView)[2]");
        By verificarFoto = By.xpath("//android.widget.ImageView[@index='3']");

        public boolean verificarSeExisteGaleria() {
            return returnElementDisplayed(verificarGaleria);
        }

        public boolean scroolElementosGaleria(){
            waitForElement(verificarGrid);
            swipeElementWithDirection(verificarGrid,"DOWN");
            swipeElementWithDirection(verificarGrid2,"DOWN");
            return returnElementDisplayed(verificarFoto);
        }

}

