package day11_IFrame_WindowHandle;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C03_Tekrar extends TestBase {

    //Window 1 de https://www.techproeducation.com adresine gidiniz

    //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın

    //Window 2'de https://www.youtube.com sayfasını açınız:

    //Window 3'te https://www.linkedin.com sayfasını açınız:

    //techproeducation sayfasına geçiniz:

    //youtube sayfasına geçiniz:

    //linkedIn sayfasına geçiniz:


    @Test
    public void name() throws InterruptedException {

        //Window 1 de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");
       String window1= driver.getWindowHandle();

        //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        Assert.assertEquals("Techpro Education | Online It Courses & Bootcamps",driver.getTitle());



        //Window 2'de https://www.youtube.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");
        String w2=driver.getWindowHandle();


        //Window 3'te https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(" https://www.linkedin.com");
        String w3=driver.getWindowHandle();

        //techproeducation sayfasına geçiniz:
        driver.switchTo().window(window1);
        Thread.sleep(15);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(w2);
        Thread.sleep(15);

        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(w3);
        Thread.sleep(15);


    }
}
