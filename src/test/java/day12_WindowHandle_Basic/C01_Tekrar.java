package day12_WindowHandle_Basic;

import Utilities.TestBase;
import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C01_Tekrar extends TestBase {

    //    https://www.techproeducation.com adresine gidiniz
//    Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
//    Tab 2'de https://www.youtube.com sayfasını açınız
//    Tab 3'te https://www.linkedin.com sayfasını açınız
//    techproeducation sayfasına geçiniz
//    youtube sayfasına geçiniz
//    linkedIn sayfasına geçiniz

    @Test
    public void name() {

 //    https://www.techproeducation.com adresine gidiniz
        driver.get(" https://www.techproeducation.com");
//    Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        Assert.assertEquals("Techpro Education | Online It Courses & Bootcamps",driver.getTitle());
//    Tab 2'de https://www.Google.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.Google.com");

//    Sayfa baslıgının Google oldugunu dogrulayınız
        Assert.assertEquals("Google",driver.getTitle());
//    Tab 3'te https://www.linkedin.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.linkedin.com");
//     Sayfa Baslıgının lınkedin icerdigini dogrulayınız
        Assert.assertEquals("Linkedin",driver.getTitle());
//    techproeducation sayfasına geçiniz
       switchToWindow(0);
//    youtube sayfasına geçiniz
        switchToWindow(1);
//    linkedIn sayfasına geçiniz
        switchToWindow(2);

        System.out.println();


    }
}
