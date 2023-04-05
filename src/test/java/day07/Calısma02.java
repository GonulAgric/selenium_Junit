package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static io.netty.util.internal.SystemPropertyUtil.contains;

public class Calısma02 {

    public static void main(String[] args) {


        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//        2- https://www.google.com/ adresine gidin
         driver.get(" https://www.google.com/");
//        3- cookies uyarisini kabul ederek kapatin
//        4Sayfa basliginin “Google” ifadesi icerdigini test edin
          String baslik=driver.getTitle();

        System.out.println("baslik = " + baslik);

        String title="Google";
       if(baslik.contains(title)){
           System.out.println("tamamdır");
       }else{
           System.out.println("yanlış ");
       }

       //        5Arama cubuguna “Nutella” yazip aratin
       WebElement aramaKutusu= driver.findElement(By.xpath("//input[@class='gLFyf']"));
       aramaKutusu.sendKeys("Nutella", Keys.ENTER);

//        6Bulunan sonuc sayisini yazdirin
       //List <WebElement> sonuc= driver.findElement(By.xpath("//div[@id='result-stats']"));

      // String sonucSayısı=sonuc.

//        7sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
//        8Sayfayi kapatin
    }
}
