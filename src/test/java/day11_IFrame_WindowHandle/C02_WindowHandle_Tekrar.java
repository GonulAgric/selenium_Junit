package day11_IFrame_WindowHandle;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.util.Set;

public class C02_WindowHandle_Tekrar extends TestBase {


       /*
    https://the-internet.herokuapp.com/windows adresine gidin.
    İlk sayfanın ID'sini alın.
    Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    "Click Here" butonuna tıklayın.
    Açılan pencereye geçin.
    Açılan yeni pencerenin sayfa başlığının(title) “New Window” olduğunu doğrulayın.
    Bir önceki pencereye dönüp sayfa başlığının “The Internet” olduğunu  doğrulayın.
    2. pencereye tekrar geçin.
    1. pencereye tekrar dönün.
     */

    @Test
    public void name() {


//    https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get(" https://the-internet.herokuapp.com/windows");
//    İlk sayfanın ID'sini alın.
       String windowHandle= driver.getWindowHandle();
        System.out.println(windowHandle);
//    Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
       String text= driver.findElement(By.xpath("//*[.='Opening a new window']")).getText();
        Assert.assertEquals("Opening a new window",text);
//    Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
       String sayfaBaslıgı= driver.getTitle();
       Assert.assertTrue(sayfaBaslıgı.contains("The Internet"));
//    "Click Here" butonuna tıklayın.
        driver.findElement(By.linkText("Click Here")).click();

//    Açılan pencereye geçin.
       Set<String> allWindowHandle=driver.getWindowHandles();


//    Açılan yeni pencerenin sayfa başlığının(title) “New Window” olduğunu doğrulayın.

//    Bir önceki pencereye dönüp sayfa başlığının “The Internet” olduğunu  doğrulayın.
//    2. pencereye tekrar geçin.
//    1. pencereye tekrar dönün.

    }
}
