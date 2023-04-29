package day_06_practice;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C02_Screenshot extends TestBase {

    // https://www.teknosa.com/ adresine gidin
    // arama cubuguna oppo yazip enter'a basınız
    // sonuc sayisini yazdiriniz
    // ilk urunun fotografını cekin
    // cikan ilk urune tiklayiniz
    // iki ArrowDown sayfayı asagiya kaydirin
    // sepete ekleyiniz
    // sepetim'e git tilayiniz
    // "Siparis Ozeti" webelementinin text'ini yazdiriniz
    // Alisverisi tamamlayiniz
    // "Teknosa'ya hos geldiniz" webelementinin text'ini yazdiriniz


    @Test
    public void test01() throws IOException {

        // https://www.teknosa.com/ adresine gidin
        driver.get("https://www.teknosa.com/");


        // arama cubuguna oppo yazip enter'a basınız
        driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("Oppo" + Keys.ENTER);


        // sonuc yazısını yazdiriniz
        WebElement sonucYazisi = driver.findElement(By.xpath("//div[@class='plp-panel-block1']"));
        System.out.println("SONUC YAZİSİ: " + sonucYazisi.getText());



        // ilk urunun fotografını cekin
        WebElement ilkUrun = driver.findElement(By.xpath("(//a[@class='prd-link gowitPlp-js'])[1]"));

        File tumSayfa = new File("target/ekranGoruntusu/tumSayfa.Jpeg");

        File gecici = ilkUrun.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(gecici,tumSayfa);






        // cikan ilk urune tiklayiniz
        // sepete ekleyiniz butonu gorununceye kadar iki PAGE_DOWN sayfayı asagiya kaydirin
        // sepete ekleyiniz
        // sepetim'e git tilayiniz
        // "Siparis Ozeti" webelementinin text'ini yazdiriniz
        // Alisverisi tamamlayiniz
        // "Teknosa'ya hos geldiniz" webelementinin text'ini yazdiriniz



    }
}