package Calisma;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IFraeme extends TestBase {
    // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
// ikinci emojiye tıklayın
// tüm ikinci emoji öğelerini tıklayın
// parent iframe e geri donun
// formu doldurun,(Formu istediğiniz metinlerle doldurun)
// apply button a basini

    @Test

    public void test1(){
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
       WebElement iframe= driver.findElement(By.xpath("(//a[@id='tooltip-xzcjqc'])[1]"));
        driver.switchTo().frame(iframe);
    }
}
