package day10;

import utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class C01_Tekrar extends TestBase {

//    https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
//    Bir metod olusturun: acceptAlert
//1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının  “You successfully clicked an alert” oldugunu test edin.
//    Bir metod olusturun: dismissAlert
//2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
//   “successfuly” icermedigini test edin.
//    Bir metod olusturun: sendKeysAlert
//3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
//    tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.


    @Test
    public void name() {


//    https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
        driver.get(" https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

//    Bir metod olusturun: acceptAlert
//1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının  “You successfully clicked an alert” oldugunu test edin.
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        bekle(2);
        driver.switchTo().alert().accept();
       String result= driver.findElement(By.xpath("//*[@id='result']")).getText();
        Assert.assertEquals("You successfully clicked an alert",result);
//    Bir metod olusturun: dismissAlert

//2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
//   “successfuly” icermedigini test edin.
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
        String result2=driver.findElement(By.xpath("//*[@id='result']")).getText();
        Assert.assertFalse(result2.contains("successfuly"));
//    Bir metod olusturun: sendKeysAlert
//3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
//    tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("Gönül");
        driver.switchTo().alert().accept();
        String result3=driver.findElement(By.xpath("//*[@id='result']")).getText();
        Assert.assertTrue(result3.contains("Gönül"));
    }
}
