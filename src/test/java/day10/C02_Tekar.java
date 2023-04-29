package day10;

import utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class C02_Tekar extends TestBase {

//    ➢ https://testcenter.techproeducation.com/index.php?page=iframe
//            ➢ Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black border’ yazisinin   oldugunu test edelim
//➢ Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
//➢ Son olarak footer daki ‘Povered By’ yazisini varligini test edilip

    @Test
    public void name() {


//    ➢ https://testcenter.techproeducation.com/index.php?page=iframe
        driver.get(" https://testcenter.techproeducation.com/index.php?page=iframe");
//    ➢ Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black border’ yazisinin   oldugunu test edelim
      String metin=  driver.findElement(By.xpath("//p[text()='An iframe with a thin black border:']")).getText();
      Assert.assertTrue(metin.contains("black border:"));
//➢ Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
        driver.switchTo().frame(0);
        String iframe=driver.findElement(By.xpath("//h1[@class='display-5 fw-bold']")).getText();
        Assert.assertEquals("Applications lists",iframe);
//➢ Son olarak footer daki ‘Povered By’ yazisini varligini test edilip
        driver.switchTo().defaultContent();
       String footer= driver.findElement(By.xpath("//p[text()='Povered By']")).getText();
       Assert.assertTrue(footer.contains("Povered By"));
    }
}
