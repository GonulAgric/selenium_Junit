package Calisma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01 {

    ////    Test Case 1: Register User
    //
    ////1. Launch browser

    @Test
    public void test01() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        ////2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        ////3. Verify that home page is visible successfully--anasayfanın basarılı bır sekılde gorunur oldugunu test edın
        WebElement logo=driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(logo.isDisplayed());
        ////4. Click on 'Signup / Login' button--
        WebElement login=driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        login.click();
        ////5. Verify 'New User Signup!' is visible--logın to your accountu u test et-baglantı basarılı ıse gronur oldugunu test et
        WebElement gorunurMu=driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(gorunurMu.isDisplayed());
        ////6. Enter name and email address--dogru kullanıcı adı ve sıfre--ahmet@nehaber.com -email / şifre 12345
        WebElement email=driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        email.sendKeys("ahmet@nehaber.com ");
        ////7. Click 'Signup' button--logın butonuna basın
        WebElement sifre=driver.findElement(By.xpath("//input[@type='password']"));
        sifre.sendKeys("12345");
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        ////8. Verify that 'ENTER ACCOUNT INFORMATION' is visible--loged in as ahmet ın basarılı bır sekılde gorunur oldugunu test edın
        WebElement loged=driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        Assert.assertTrue(loged.isDisplayed());
        //    //logout butonuna basın
        driver.findElement(By.xpath("//a[text()=' Logout']")).click();
        //
        //    //anasayfasa geldıgınızı test edın
        String expecteUrl="https://automationexercise.com/login";
        String actuelUrl= driver.getCurrentUrl();
        Assert.assertEquals(expecteUrl,actuelUrl);
        //    //driver close
        driver.close();
    }

    public static class Calısma02 {

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
}