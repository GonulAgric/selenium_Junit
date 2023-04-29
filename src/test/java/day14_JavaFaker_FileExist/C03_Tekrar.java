package day14_JavaFaker_FileExist;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_Tekrar extends TestBase {

      /*
    Masaüstünde "logo.jpeg" dosyası oluşturun.
    Bu dosyanın varlığını doğrulayın.
     */

    @Test
    public void name() {

//        Masaüstünde "logo.jpeg" dosyası oluşturun.

//        Bu dosyanın varlığını doğrulayın.
        String dosyaYolu = System.getProperty("user.home")+"/Desktop/logo.jpeg/";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}