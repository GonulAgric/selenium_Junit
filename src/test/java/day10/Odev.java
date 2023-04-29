package day10;

import utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev extends TestBase {

    //● https://the-internet.herokuapp.com/iframe adresine
//gidin.
//● Bir metod olusturun: iframeTest
//○ “An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
//○Text Box’a “Merhaba Dunya!” yazin.
//○TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur
//oldugunu dogrulayin ve konsolda yazdirin

    @Test
    public void name() {

//● https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get(" https://the-internet.herokuapp.com/iframe");
//● Bir metod olusturun: iframeTest

//○ “An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
         WebElement test = driver.findElement(By.xpath("//h3"));
         Assert.assertTrue(test.isEnabled());
        System.out.println(test.getText());
 //○Text Box’a “Merhaba Dunya!” yazin.
        driver.switchTo().frame(0);
        WebElement test2 = driver.findElement(By.xpath("//p"));
        test2.clear();
        test2.sendKeys("Merhaba Dünya");

//○TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur
//oldugunu dogrulayin ve konsolda yazdirin
       driver.switchTo().defaultContent();
       WebElement gorunurMu= driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
      Assert.assertTrue(gorunurMu.isDisplayed());
        System.out.println(gorunurMu.getText());



    }

}