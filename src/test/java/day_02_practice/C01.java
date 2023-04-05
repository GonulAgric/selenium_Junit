package day_02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {


        // https://www.amazon.com/ adresine gidin
        // arama kutusunun, tagName'inin 'input' oldugunu test ediniz
        // arama kutusunun, name attribute'nun degerinin 'field-keywords' oldugunu test edin
        // sayfayi kapatiniz

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));




        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        // arama kutusunun, tagName'inin 'input' oldugunu test ediniz
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@type='text']"));
        String ectual= aramaKutusu.getTagName();
        String expendet="input";
        if (ectual.equals(expendet)){
            System.out.println("Arama kutusu Tagname input");
        }else {
            System.out.println("Arama kutusu Tagname input degil");
        }
        // arama kutusunun, name attribute'nun degerinin 'field-keywords' oldugunu test edin
        String actuelnameAtribute=aramaKutusu.getAttribute("name");
        String expendetName="field-keywords";
        if (actuelnameAtribute.equals(expendetName)){
            System.out.println("icerir");
        }else {
            System.out.println("icermiyor");
        }

        // sayfayi kapatiniz
        driver.close();

    }

}