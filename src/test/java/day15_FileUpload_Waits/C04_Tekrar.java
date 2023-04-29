package day15_FileUpload_Waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C04_Tekrar extends TestBase {

    /*
    https://the-internet.herokuapp.com/dynamic_controls sayfasına gidin
    Remove tuşuna basın
    "It's gone!" yazısını doğrulayın
     */

    @Test
    public void name() {

//        https://the-internet.herokuapp.com/dynamic_controls sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//        Remove tuşuna basın
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

//        "It's gone!" yazısını doğrulayın
        Assert.assertTrue(driver.findElement(By.id("message")).isDisplayed());
    }
}
