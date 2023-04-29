package day13_ActionsClass;

import utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C04_Tekrar extends TestBase {

   /*
    https://jqueryui.com/droppable/ adresine gidin
    "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
     */

    @Test
    public void name() {

//        https://jqueryui.com/droppable/ adresine gidin
        driver.get("https://jqueryui.com/droppable/");


//        "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(source,target).perform();


    }
}
