package Calisma;

import utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task05 extends TestBase {


    //-http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
// -Alert with OK karşısındaki click the button to display an alert box: butonuna tıklayınız
//-Çıkan alert üzerindeki yazıyı konsola yazdırınız ve tamam butonuna basınız
//-Alert with OK & Cancel butonuna basınız ve sonrasında click the button to display a confirm box butonuna basınız
//-Çıkan alert'te iptal butonuna basınız
// -Alert with Textbox butonuna basınız ve sonrasında click the button to demonstrate the prompt box butonuna basınız
//-Çıkan prompt box'a 'isminizi' yazdırınız ve Tamam'a basınız
//-Çıkan mesajı konsola yazdırınız
//-Çıkan mesajın 'Hello <isminiz> How are you today' yazdığını doğrulayınız


    @Test
    public  void test01() throws InterruptedException {
        driver.get("http://demo.automationtesting.in/Alerts.html");
       WebElement alert= driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
       alert.click();
       Thread.sleep(15);
        System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        WebElement alert2=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        alert2.click();
        Thread.sleep(15);
        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
        driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Gönül");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        System.out.println("driver.findElement(By.xpath(\"//p[@id='demo1']\")).getText() = " + driver.findElement(By.xpath("//p[@id='demo1']")).getText());
        String expendet=driver.findElement(By.xpath("//p[@id='demo1']")).getText();
        Assert.assertEquals(expendet,"Hello Gönül How are you today");


    }
}
