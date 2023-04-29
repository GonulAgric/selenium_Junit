package day17_ScreenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C01_Tekrar extends TestBase {

    @Test
    public void name() throws IOException {

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Sayfanın resmini alalım
        String tarih = new SimpleDateFormat("_hh_mm_ss_dd_MM_yyyy_").format(new Date());
        String dosyaYolu="TestOutput/screenshot"+tarih+".png";
        TakesScreenshot tss = (TakesScreenshot) driver;
        File screenShot = tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot,new File(dosyaYolu));
        //Sonra amazon sayfasına gidelim
        driver.get("https:/amazon.com");
        //Amazon sayfasının ekran görüntüsünü alalım

       String dosyaYolu2="TestOutput/screenshot"+tarih+"element.png";
      TakesScreenshot ts= (TakesScreenshot)  driver;
      File screenShots=ts.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(screenShots,new File(dosyaYolu));





















    }
}
