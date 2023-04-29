package Calisma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C04 {

    /*
    Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
    -3 farklı test methodu oluşturalım
        1.Method:
            a. Yil,ay,gün dropdown menu'leri locate ediniz
            b. Select objesi olustur
            c. Select object i kullaarak 3 farkli sekilde secim yapiniz
        2.Method:
            a. Tüm eyalet isimlerini yazdıralım
        3.Method:
            a. State dropdownindaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim
     */
   WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(" https://testcenter.techproeducation.com/index.php?page=dropdown");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
       // driver.close();
    }

    @Test
    public void name() {
       WebElement yıl= driver.findElement(By.xpath("//select[@id='year']"));
        Select select=new Select(yıl);
        select.selectByIndex(5);
        WebElement ay= driver.findElement(By.xpath("//select[@id='month']"));
        Select select1=new Select(ay);
        select1.selectByVisibleText("April");
        WebElement gun= driver.findElement(By.xpath("//select[@id='day']"));
        Select select2=new Select(gun);
        select1.selectByIndex(1);
    }

    public static class JunitCalisma {

        public static void main(String[] args) {


    //    *** Aşağıdaki Task'i Junit framework'u ile yapınız
    //- http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
    //            - Add Element butonuna 100 defa basınız
    //- 100 defa basıldığını test ediniz
    //- 90 defa delete butonuna basınız
    //- 90 defa basıldığını doğrulayınız
    //- Sayfayı kapatınız


            System.setProperty("webdriver.http.factory", "jdk-http-client");
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


            driver.get("http://the-internet.herokuapp.com/add_remove_elements/");


            for (int i=1;i<101;i++) {
                driver.findElement(By.xpath("//*[text()='Add Element']")).click();
            }
              List<WebElement> buton=  driver.findElements(By.xpath("//button[@class='added-manually']"));
              if (buton.size()==100){
                  System.out.println("100 defa basılmıstır");
              }else {
                  System.out.println("basılmamıstır");
              }
             for (int i=1; i<90;i++)
            driver.findElement(By.xpath("//button[@class='added-manually']")).click();
            List<WebElement> delete=driver.findElements(By.xpath("//button[@class='added-manually']"));
            if (delete.size()==90){
                System.out.println("90 defa basılmıstır");
            }else {
                System.out.println("90 defa basılmamıstır");
            }
        }

    }
}
