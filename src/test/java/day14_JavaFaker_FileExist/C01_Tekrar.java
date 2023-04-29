package day14_JavaFaker_FileExist;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;

public class C01_Tekrar extends TestBase {
    @Test
    public void name() {



//"https://techproeducation.com/" gidin
        driver.get( "https://techproeducation.com/");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum

//İlk kelime SHIFT tuşuna basılı şekilde, ikinci kelime basılmadan "TECHPRO education" araması yapın.

    WebElement aramaKutusu = driver.findElement(By.name("s"));
        Actions action=new Actions(driver);
        action.keyDown(aramaKutusu, Keys.SHIFT).sendKeys("techpro").keyUp(Keys.SHIFT).sendKeys("education")
                .build().perform();
    }
}
