package day21_JSExecuter;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_Tekrar extends TestBase {
    @Test
    public void name() {


        //        Techpro education ana sayfasina git
        driver.get("https://techproeducation.com/");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

//        Arama kutusuna QA yaz
       WebElement aramaKutusu = driver.findElement(By.xpath("//input[@title='Search']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='QA'",aramaKutusu);
        aramaKutusu.submit();


    }
}
