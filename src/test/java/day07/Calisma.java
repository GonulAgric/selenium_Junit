package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Calisma {

    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//        1.“https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
//        2.Username kutusuna “standard_user” yazdirin

//        3.Password kutusuna “secret_sauce” yazdirin
//        4.Login tusuna basin
//        5.Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
//        6.Add to Cart butonuna basin
//        7.Alisveris sepetine tiklayin
//        8.Sectiginiz urunun basarili olarak sepete eklendigini control edin
//        9.Sayfayi kapatin


    }

}

