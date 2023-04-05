package Calisma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02 {

    @Test
    public void test01() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully -- Ana sayfanın başarıyla göründüğünü doğrulayın
        driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        //4. Click on 'product' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        //5. verify user navigated to all products page successfully--kullanıcının tüm ürünler sayfasına başarıyla gittiğini doğrulayın
       // String expendetUrl="https://automationexercise.com/products";
        //String actuelUrl=driver.getCurrentUrl();
        //Assert.assertEquals(expendetUrl,actuelUrl);
        //6.enter product name in search input and click search button--arama girişine ürün adını girin ve ara düğmesine tıklayın
        WebElement aramaKutusu= driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.sendKeys("elbise");
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
        //7. verify searched products is visible--aranan ürünlerin görünür olduğunu doğrulayın
       WebElement gorunurMu= driver.findElement(By.xpath("//h2[text()='Searched Products']"));
       Assert.assertTrue(gorunurMu.isDisplayed());

        //8.close drıver
        driver.close();
    }
}