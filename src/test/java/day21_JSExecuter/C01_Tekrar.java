package day21_JSExecuter;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_Tekrar extends TestBase {
    @Test
    public void name() {


        //http://www.uitestpractice.com/Students/Form sayfasına git
        driver.get("http://www.uitestpractice.com/Students/Form ");
        //Formu doldur
        Faker faker=new Faker();
        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys(faker.name().firstName(),Keys.TAB,faker.name().lastName(),Keys.TAB,Keys.TAB,Keys.TAB,
                Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"Gönül");

        //Submit tuşuna tıkla
        WebElement submit = driver.findElement(By.xpath("//*[text()='Submit']"));
       // submit.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",submit);

        //Sayfa adresinin "http://www.uitestpractice.com/Students/Form?optradio=on" olduğunu doğrula.
        Assert.assertNotEquals("http://www.uitestpractice.com/Students/Form?optradio=on",driver.getCurrentUrl());
    }
}
