package day17_ScreenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C02_Tekrar extends TestBase {

    @Test
    public void name() throws IOException {

        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        //Arama bölümünde iphone aratınız
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+Keys.ENTER);

        //Sonuc yazısının resmini alınız
        WebElement sonucYazisi = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        String date =new SimpleDateFormat("_hh_mm_ss_yyyy_").format(new Date());
        String dosyaYolu= "TestOutput/screenshot"+date+".png";
        TakesScreenshot tss= (TakesScreenshot) driver;

        FileUtils.copyFile(sonucYazisi.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));
    }
}
