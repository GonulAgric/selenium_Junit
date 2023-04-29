package day13_ActionsClass;

import utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C02_Tekrar extends TestBase {

     /*
    Amazon anasayfasına gidin
    "Account & List" üzerinde bekleyin (mouse over - hover over)
    Açılan menüde "Account" linkine tıklayın
    Açılan sayfanın başlığının "Your Account" içerdiğini doğrulayın
     */

    @Test
    public void name() {
//
//        Amazon anasayfasına gidin
          driver.get("https://amazon.com");
//        "Account & List" üzerinde bekleyin (mouse over - hover over)
        WebElement accountList=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(accountList).perform();

//        Açılan menüde "Account" linkine tıklayın
        driver.findElement(By.linkText("Account")).click();
//        Açılan sayfanın başlığının "Your Account" içerdiğini doğrulayın
        String baslık=driver.getTitle();
        Assert.assertTrue(baslık.contains( "Your Account"));
    }
}
