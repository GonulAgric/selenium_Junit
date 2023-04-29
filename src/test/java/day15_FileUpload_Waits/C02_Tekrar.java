package day15_FileUpload_Waits;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C02_Tekrar extends TestBase {
    @Test
    public void name() {

//        https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
//        Start buttonuna tıklayın
        driver.findElement(By.xpath("//*[text()='Start']")).click();
//        Hello World! Yazının sitede oldugunu test edin

    }
}
