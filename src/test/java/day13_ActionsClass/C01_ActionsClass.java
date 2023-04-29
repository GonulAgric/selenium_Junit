package day13_ActionsClass;

import utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C01_ActionsClass extends TestBase {

    /*
    https://the-internet.herokuapp.com/context_menu  sitesine gidin
    Kutuya sağ tıklayın
    Alert'te cikan yazinin "You selected a context menu" oldugunu test edin
    Tamam diyerek alert'i kapatın
 */
    @Test
    public void name() {

//        https://the-internet.herokuapp.com/context_menu  sitesine gidin
        driver.get(" https://the-internet.herokuapp.com/context_menu");
//        Kutuya sağ tıklayın
        WebElement kutu= driver.findElement(By.id("hot-spot"));
        Actions actions=new Actions(driver);
        actions.contextClick(kutu).perform();
//        Alert'te cikan yazinin "You selected a context menu" oldugunu test edin
       String alert= driver.switchTo().alert().getText();
        Assert.assertEquals( "You selected a context menu",alert);
//        Tamam diyerek alert'i kapatın
        driver.switchTo().alert().accept();
    }
}
