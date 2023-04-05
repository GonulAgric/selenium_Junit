package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class JunitCalisma {

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