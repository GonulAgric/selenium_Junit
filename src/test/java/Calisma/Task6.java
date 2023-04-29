package Calisma;

import utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task6 extends TestBase {


 // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
// ikinci emojiye tıklayın
// İkinci emoji öğelerini yazdırınız
// Parent iframe e geri donun
// Formu doldurun,(Formu istediğiniz metinlerle doldurun)
// Apply button a basiniz

    @Test
    public void name() {


// https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
// ikinci emojiye tıklayın

        WebElement ifarame=driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[1]"));
       // driver.switchTo().frame(ifarame)
// İkinci emoji öğelerini yazdırınız

// Parent iframe e geri donun
// Formu doldurun,(Formu istediğiniz metinlerle doldurun)
// Apply button a basiniz
    }
}
