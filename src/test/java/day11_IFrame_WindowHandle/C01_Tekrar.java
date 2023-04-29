package day11_IFrame_WindowHandle;

import utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_Tekrar extends TestBase {


    /*
https://the-internet.herokuapp.com/iframe sayfasına gidiniz
Kalın yazının "Editor" kelimesimi içerdiğini doğrulayınız
Textbox içindeki yazıyı siliniz.
Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.
 */

    @Test
    public void test1() throws InterruptedException {

//        https://the-internet.herokuapp.com/iframe sayfasına gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");
//        Kalın yazının "Editor" kelimesimi içerdiğini doğrulayınız
       String  kalınYazı= driver.findElement(By.xpath("//h3")).getText();
        Assert.assertTrue(kalınYazı.contains("Editor"));
//        Textbox içindeki yazıyı siliniz.
       WebElement iframe= driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
       Thread.sleep(15);
       driver.switchTo().frame(iframe);
      WebElement texBox= driver.findElement(By.xpath("//p[.='Your content goes here.']"));
      texBox.clear();

//        Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
        texBox.sendKeys("Bu textbox iFrame içinde yer almaktadır");
//        Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.

        driver.switchTo().parentFrame();

        WebElement yazı=driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
        Assert.assertTrue(yazı.isDisplayed());
//
    }
}
