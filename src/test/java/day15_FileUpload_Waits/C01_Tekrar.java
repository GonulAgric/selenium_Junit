package day15_FileUpload_Waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_Tekrar extends TestBase {
        @Test
        public void name() {

//                https://the-internet.herokuapp.com/upload adresine gidin
                driver.get("https://the-internet.herokuapp.com/upload");
//                logo.jpeg dosyasını yükleyin(upload)
                WebElement dosyaSec = driver.findElement(By.id("file-upload"));
                String dosyaYolu = "C:/Users/hatic/Desktop/b129.txt";
                dosyaSec.sendKeys(dosyaYolu);

               WebElement upload =  driver.findElement(By.id("file-submit"));
               upload.click();

//                "File Uploaded!" textinin görüntülendiğini test edin
               WebElement fileUploaded = driver.findElement(By.xpath("//h3"));
                Assert.assertTrue(fileUploaded.isDisplayed());


        }

}