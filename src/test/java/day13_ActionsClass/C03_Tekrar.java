package day13_ActionsClass;

import utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class C03_Tekrar extends TestBase {

    /*
    https://techproeducation.com adresine gidin
    Sayfanın alt tarafına gidin
    Sayfanın üst tarafına gidin
    */
    @Test
    public void name() {

//        https://techproeducation.com adresine gidin
        driver.get("https://techproeducation.com ");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum
//        Sayfanın alt tarafına gidin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        Sayfanın üst tarafına gidin
        actions.sendKeys(Keys.PAGE_UP).perform();
    }
}
