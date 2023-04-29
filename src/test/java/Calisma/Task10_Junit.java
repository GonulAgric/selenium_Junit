package Calisma;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class Task10_Junit extends TestBase {
    @Test
    public void task10() throws IOException {
        //https://www.selenium.dev/downloads/ adresine gidelim
        driver.navigate().to("https://www.selenium.dev/downloads");

        //Sayfanın resmini alalım

        String tarih = new SimpleDateFormat("_hh_mm_ss_dd_MM_yyyy_").format(new Date());
        String dosyaYolu = "TestOutput/screenshot/screenshot"+tarih+"tumsayfa.png";
        TakesScreenshot tss = (TakesScreenshot) driver;
        File screenShot = tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot, new File(dosyaYolu));


        //Platforms Supported by Selenium altındaki Browsers bölümü görünene kadar sayfayı indirelim
        Actions actions = new Actions(driver);
        WebElement browser = driver.findElement(By.xpath("(//button[@class='btn btn-dark btn-lg btn-block rounded-0 text-left'])[1]"));
        actions.moveToElement(browser).perform();
        browser.click();

        //Browser bölümünden Chrome driver bölümündeki documentation linkine tıklıyalım
        driver.findElement(By.xpath("(//*[text()='documentation'])[5]")).click();

        //Documentation webelementinin resmini alalım
        WebElement chromDriverDocumentation = driver.findElement(By.xpath("//*[text()='ChromeDriver Documentation']"));
        String dosyaYolu1 = "TestOutput/screenshot/screenshot"+tarih+"element.png";
        FileUtils.copyFile(chromDriverDocumentation.getScreenshotAs(OutputType.FILE), new File(dosyaYolu1));

        //All versions available in Downloads altında Latest stable release olan linki tıklayalım
        driver.findElement(By.xpath("//*[text()='ChromeDriver 112.0.5615.49']")).click();

        //Açılan pencerede chromedriver'i indirelim
        //ChromeDriver'ı indirebilmem için kontrolüm dışında açılan sayfaya driver'ımı geçirmem gerekiyor.

        Set<String> windowHandles = driver.getWindowHandles();
        String ilkSayfaHandle = driver.getWindowHandle();

        for (String w : windowHandles) {
            if (!w.equals(ilkSayfaHandle)){
                driver.switchTo().window(w);
            }
        }

        driver.findElement(By.xpath("//*[text()='chromedriver_win32.zip']")).click();

        //Driver'in indiğini doğrulayalım

        String farkliKisim = System.getProperty("user.home");
        String ortakKisim = "/Downloads/chromedriver_win32.zip";
        String dosyaYolu2 = farkliKisim+ortakKisim;

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu2)));

        //İndirmiş olduğumuz dosyayı silelim


        //Silindiğini doğrulayalım

        //Not: Bu task'in her adımı için Html rapor oluşturalım(Extent Report)
    }
}