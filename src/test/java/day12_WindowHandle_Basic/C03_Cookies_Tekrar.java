package day12_WindowHandle_Basic;

import utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class C03_Cookies_Tekrar extends TestBase {
    @Test
    public void name() {

//        1-Amazon anasayfaya gidin
        driver.get("https://amazon.com");
//        2-tum cookie'leri listeleyin
        Set<Cookie> allCookie = driver.manage().getCookies();
        allCookie.stream().forEach(t -> System.out.println(allCookie));

//        3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        int tümCookie= allCookie.size();
       // Assert.assertTrue(tümCookie.size()>5);

//        4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        String cookieValue=driver.manage().getCookieNamed("i18n-prefs").getValue();
        Assert.assertEquals("USD",cookieValue);

//        5-ismi "en sevdigim cookie" ve degeri "cikolatali" olan bir cookie  olusturun ve sayfaya ekleyin
        Cookie cookie=new Cookie("en sevdigim cookie","cikolatali");
        driver.manage().addCookie(cookie);

//        6-eklediginiz cookie'nin sayfaya eklendigini test edin
        String yeniCokieValue= driver.manage().getCookieNamed("en sevdigim cookie").getValue();
        Assert.assertEquals("cikolatali",yeniCokieValue);

//        7-ismi skin olan cookie'yi silin ve silindigini test edin
        int silmedenOnce=driver.manage().getCookies().size();
        driver.manage().deleteCookieNamed("skin");
        int sildiktenSonra=driver.manage().getCookies().size();
        Assert.assertEquals(1,silmedenOnce-sildiktenSonra);

//        8-tum cookie'leri silin ve silindigini test edin
        driver.manage().deleteAllCookies();
        Assert.assertEquals(0,driver.manage().getCookies().size());
    }

}