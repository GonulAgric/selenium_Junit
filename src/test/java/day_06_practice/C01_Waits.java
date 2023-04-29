package day_06_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class C01_Waits extends TestBase {

    // https://the-internet.herokuapp.com/dynamic_controls adresine gidiniz
    // Textbox'in etkin olmadıgını(enable) test edin
    // Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
    // It's enable! mesajının goruntulendigini test edin
    // Textbox'in etkin oldugunu(enable) test edin
    @Test
    public void name() {

        // https://the-internet.herokuapp.com/dynamic_controls adresine gidiniz
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        // Textbox'in etkin olmadıgını(enable) test edin
        WebElement texBox=driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertFalse(texBox.isEnabled());


        // Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        WebElement enableButonu = driver.findElement(By.xpath("(//button[@autocomplete='off'])[2]"));
        enableButonu.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(texBox));
        /*
        Daha fazla bekleme süresi gerektiren belirli Webelementler için wait kullanılır.
         */

        // It's enable! mesajının goruntulendigini test edin
       WebElement ıtsEnableYazısı =  driver.findElement(By.xpath("//p[text()=\"It's enabled!\"]"));
       Assert.assertTrue(ıtsEnableYazısı.isDisplayed());

        // Textbox'in etkin oldugunu(enable) test edin
        Assert.assertTrue(texBox.isEnabled());
    }
}
