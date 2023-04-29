package Calisma;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class Task extends TestBase {
    @Test
    public void name() {

//        1. "https://facebook.com" Adresine gidin
         driver.get("https://facebook.com");

//        2. “create new account” butonuna basin
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
//        3. “firstName” giris kutusuna bir isim yazin
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("gönül"+ Keys.ENTER);
        //        5. “email” giris kutusuna bir email yazin
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("gnl@gmail.com"+Keys.ENTER);
//        6. “email” onay kutusuna emaili tekrar yazin
        driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("gnl@gmail.com"+Keys.ENTER);
//        7. Bir sifre girin
        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("1234567"+Keys.ENTER);
//        8. Tarih icin gun secin
        
//        9. Tarih icin ay secin
//        10. Tarih icin yil secin,
//        11. Cinsiyeti secin,
//        12. Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.


//        13. Sayfayi kapatin
    }
}